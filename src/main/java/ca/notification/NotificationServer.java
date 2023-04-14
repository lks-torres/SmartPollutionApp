package ca.notification;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class NotificationServer extends NotificationGrpc.NotificationImplBase {
    public static List<String> subscribedEmails = new ArrayList<String>();

    public static void main(String args[]) throws IOException, InterruptedException {
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
            subscribedEmails.add(request.getSubscriptionEmail());
            subscriptionConfirmation = "Subscribed email " + request.getSubscriptionEmail();
            printSubscribedEmails();
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
            String notificationMessage = String.format("You have received %d notification(s), please check for emails from notification@smartpollution.ie");
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
    	
        if(subscribedEmails.isEmpty()){
        	System.out.println("Subscribed Emails:");
        	System.out.println("No subscribed emails yet.");
        }else {
            System.out.println("Subscribed Emails:");
            System.out.println(subscribedEmails);
        }

        }
    }