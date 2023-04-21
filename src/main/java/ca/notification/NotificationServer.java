package ca.notification;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import ca.notification.NotificationGrpc.NotificationImplBase;

public class NotificationServer extends NotificationImplBase {
    public static List<String> subscribedEmails = new ArrayList<String>();
    public static final String EMAIL_FILE = "C:\\Users\\lucas\\eclipse-workspace\\SmartPollution\\src\\main\\java\\ca\\notification\\subscribed_emails.csv";

    public static void main(String args[]) throws IOException, InterruptedException {
        readSubscribedEmails();
        
        Server server = ServerBuilder.forPort(8080)
                .addService(new NotificationServer())
                .build();

        server.start();
        System.out.println("Server started");

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down server");
            server.shutdown();
        }));

        server.awaitTermination();
    }
    
    @Override
    public void subscription(SubscriptionRequest request, StreamObserver<SubscriptionResponse> responseObserver) {
        String subscriptionConfirmation;
        if (isValidEmail(request.getSubscriptionEmail())) {
            if (isSubscribed(request.getSubscriptionEmail())) {
                subscriptionConfirmation = "Email already subscribed";
            } else {
                subscribedEmails.add(request.getSubscriptionEmail());
                subscriptionConfirmation = "Subscription Confirmed";
                writeSubscribedEmail(request.getSubscriptionEmail());
            }
        } else {
            subscriptionConfirmation = "Invalid email address " + request.getSubscriptionEmail();
        }
        SubscriptionResponse response = SubscriptionResponse.newBuilder()
                .setSubscriptionConfirmation(subscriptionConfirmation)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void notify(NotificationRequest request, StreamObserver<NotificationResponse> responseObserver) {
        String notificationEmail = request.getNotificationEmail();
        String notificationMessage;
        if (isSubscribed(notificationEmail)) {
            notificationMessage = String.format("You have received %d notification(s), please check for emails from notification@smartpollution.ie", request.getNotificationEmail());
        } else {
            notificationMessage = "You are not subscribed to receive notifications";
        }
        NotificationResponse response = NotificationResponse.newBuilder()
                .setNotificationEmail(notificationEmail)
                .setNotificationConfirmation(notificationMessage)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void doNotification(RequestMessage request, StreamObserver<ResponseMessage> responseObserver) {
        int length = request.getText().length();
        ResponseMessage response = ResponseMessage.newBuilder()
                .setLength(length)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private static void readSubscribedEmails() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(EMAIL_FILE));
        String line;
        while ((line = reader.readLine()) != null) {
            subscribedEmails.add(line.trim());
        }
        reader.close();
    }

    private void writeSubscribedEmail(String email) {
        try {
            FileWriter writer = new FileWriter(EMAIL_FILE, true);
            writer.write(email + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean isSubscribed(String email) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(EMAIL_FILE));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals(email)) {
                    reader.close();
                    return true;
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    private boolean isValidEmail(String email) {
        // Validate email address
        if (email == null || email.isEmpty()) {
            return false;
        }
        int atCount = 0;
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (c == '@') {
                atCount++;
            } else if (!Character.isLetterOrDigit(c) && c != '.' && c != '-') {
                return false;
            }
        }
        return atCount == 1 && (email.endsWith(".com") || email.endsWith(".ie"));
    }

    private void printSubscribedEmails() {
        System.out.println("Subscribed Emails:");
        if(subscribedEmails.isEmpty()){
            System.out.println("No subscribed emails yet.");
        }else {
            System.out.println(subscribedEmails);
        }
    }
   }