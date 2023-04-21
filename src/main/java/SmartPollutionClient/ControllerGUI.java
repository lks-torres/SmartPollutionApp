package SmartPollutionClient;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import ca.notification.NotificationGrpc;
import ca.notification.NotificationRequest;
import ca.notification.NotificationResponse;
import ca.notification.NotificationServer;
import ca.notification.SubscriptionRequest;
import ca.notification.SubscriptionResponse;
import ca.pollutionData.GetMonthIndexRequest;
import ca.pollutionData.GetMonthIndexResponse;
import ca.pollutionData.GetReadingsRequest;
import ca.pollutionData.GetReadingsResponse;
import ca.pollutionData.GetStatisticsRequest;
import ca.pollutionData.GetStatisticsResponse;
import ca.pollutionData.PollutionDataServiceGrpc;
import ca.userAuthentication.LoginRequest;
import ca.userAuthentication.LoginResponse;
import ca.userAuthentication.LoginStatus;
import ca.userAuthentication.LogoutRequest;
import ca.userAuthentication.LogoutResponse;
import ca.userAuthentication.LogoutStatus;
import ca.userAuthentication.RequestMessage;
import ca.userAuthentication.ResponseMessage;
import ca.userAuthentication.userAuthenticationGrpc;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
	
public class ControllerGUI implements ActionListener{
	//Variables for userAuthentication services
	private String userStatus = "Offline";
	private String userEmail = "";
    private JTextField loginEmail, logoutEmail;
    private JPasswordField password, logout;
    private JLabel login;
    private JTextField pollutionArea, pollutionMonth, pollutionData;
    
    //Variables for notification services
    private JTextField subscriptionEmail, notificationEmail;

    private JPanel getLoginService() {
        JPanel panel = new JPanel();
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        JLabel emailLabel = new JLabel("Email:");
        panel.add(emailLabel);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        loginEmail = new JTextField(10);
        panel.add(loginEmail);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        password = new JPasswordField(10);
        panel.add(password);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        panel.add(loginButton);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        login = new JLabel("");
        panel.add(login);

        panel.setLayout(boxlayout);

        return panel;
    }

    private JPanel getLogoutService() {

        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        JLabel label = new JLabel("Enter email to logout")    ;
        panel.add(label);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        logoutEmail = new JTextField("",10);
        panel.add(logoutEmail);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        JButton button = new JButton("Logout");
        button.addActionListener(this);
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        panel.setLayout(boxlayout);

        return panel;

    }
    private JPanel getSubscription() {
        JPanel panel = new JPanel();
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        JLabel emailLabel = new JLabel("Email:");
        panel.add(emailLabel);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        subscriptionEmail = new JTextField(10);
        panel.add(subscriptionEmail);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        JButton subcribeButton = new JButton("Subscribe");
        subcribeButton.addActionListener(this);
        panel.add(subcribeButton);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        JLabel subscribe = new JLabel("");
        panel.add(subscribe);

        panel.setLayout(boxlayout);

        return panel;
    }
    private JPanel getNotification() {
        JPanel panel = new JPanel();
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        JLabel emailLabel = new JLabel("Email:");
        panel.add(emailLabel);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        notificationEmail = new JTextField(10);
        panel.add(notificationEmail);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        JButton notificationButton = new JButton("Check Notification Received");
        notificationButton.addActionListener(this);
        panel.add(notificationButton);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        JLabel notification = new JLabel("");
        panel.add(notification);

        panel.setLayout(boxlayout);

        return panel;
    }    
    private JPanel getPollutionData() {

        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

        JLabel areaLabel = new JLabel("Enter Area");
        panel.add(areaLabel);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        pollutionArea = new JTextField("", 10);
        panel.add(pollutionArea);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        JLabel monthLabel = new JLabel("Month");
        panel.add(monthLabel);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        pollutionMonth = new JTextField(10);
        panel.add(pollutionMonth);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        JButton button = new JButton("Get Data");
        button.addActionListener(this);
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(10, 0)));
        panel.setLayout(boxlayout);

        return panel;

    }

		public static void main(String[] args) {

			ControllerGUI gui = new ControllerGUI();

			gui.build();
		}

		private void build() { 

		    JFrame frame = new JFrame("Smart Pollution Application");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    // Set the panel to add buttons
		    JPanel panel = new JPanel();

		    // Set the BoxLayout to be X_AXIS: from left to right
		    BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

		    panel.setLayout(boxlayout);

		    // Set border for the panel
		    panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));

		    // Add the login and logout services to the main panel
		    panel.add(getLoginService());
		    panel.add(getLogoutService());
		    panel.add(getSubscription());
		    panel.add(getNotification());
		    panel.add(getPollutionData());

		    // Set size for the frame
		    frame.setSize(300, 300);

		    // Set the window to be visible as the default to be false
		    frame.add(panel);
		    frame.pack();
		    frame.setVisible(true);
		}
		@Override
		  public void actionPerformed(ActionEvent e) {
	        JButton button = (JButton) e.getSource();
	        String label = button.getActionCommand();

	        if (label.equals("Login")) {
	            if (userStatus.equals("Online")) {
	                JOptionPane.showMessageDialog(null, "You are is already logged in");
	                return;
	            }

	            String emailInput = loginEmail.getText();
	            String passwordInput = new String(password.getPassword());

	            System.out.println("Verifying credentials");
	            System.out.println("Entered email: " + emailInput);
	            System.out.println("Entered password: " + passwordInput);

	            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();

	            try {
	                userAuthenticationGrpc.userAuthenticationBlockingStub authStub = userAuthenticationGrpc.newBlockingStub(channel);

	                LoginRequest loginRequest = LoginRequest.newBuilder()
	                        .setEmail(emailInput)
	                        .setPassword(passwordInput)
	                        .build();

	                LoginResponse loginResponse = authStub.login(loginRequest);

	                if (loginResponse.getStatus() == LoginStatus.LOGGED_IN_SUCCESSFULLY) {
	                	JOptionPane.showMessageDialog(null,"Login successful");
	                	System.out.println("Login successful");
	                    userEmail = emailInput;
	                    userStatus = "Online";
	                } else {
	                	JOptionPane.showMessageDialog(null,"Login failed");
	                	System.out.println("Login failed");
	                }
	            } catch (Exception ex) {
	                System.err.println("Error: " + ex.getMessage());
	            } finally {
	                channel.shutdown();
	            }

	        } else if (label.equals("Logout")) {
	            if (userStatus.equals("Offline")) {
	                JOptionPane.showMessageDialog(null,"You are already logged out");
	                System.out.println("User already logged out");
	                return;
	            }

	            String emailInput = logoutEmail.getText();

	            System.out.println("Logging out");
	            System.out.println("Entered email: " + emailInput);

	            // Establish channel
	            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();

	            try {
	                // Create stub
	                userAuthenticationGrpc.userAuthenticationBlockingStub logoutStub = userAuthenticationGrpc.newBlockingStub(channel);

	                // Prepare logout request message
	                LogoutRequest.Builder logoutRequestBuilder = LogoutRequest.newBuilder().setUserStatus(userStatus);

	                // Check if user is online and entered email matches login email before logging out
	                if (userStatus.equals("Online") && emailInput.equalsIgnoreCase(userEmail)) {
	                    LogoutResponse logoutResponse = logoutStub.logout(logoutRequestBuilder.build());

	                    if (logoutResponse.getStatus() == LogoutStatus.LOGGED_OUT_SUCCESSFULLY) {
	                    	JOptionPane.showMessageDialog(null,"Logout successful");
	                        System.out.println("Logout successful");
	                        userStatus = "Offline";
	                        userEmail = "";
	                    } else {
	                    	JOptionPane.showMessageDialog(null,"Logout failed");
	                        System.out.println("Logout failed");
	                    }
	                } 
	            } catch (Exception ex) {
	                // Handle any exceptions that may occur
	                System.err.println("Error: " + ex.getMessage());
	            } finally {
	                // Shutdown channel
	                channel.shutdown();
	            }
	        }
	        else if (label.equals("Subscribe")) {
	            // Get the email address from the subscriptionEmail text field
	            String email = subscriptionEmail.getText();

	            // Check if email field is empty
	            if (email.trim().isEmpty()) {
	                JOptionPane.showMessageDialog(null, "Email address cannot be blank");
	                return;
	            }

	            // Establish channel
	            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();

	            try {
	                // Create stub
	                NotificationGrpc.NotificationBlockingStub notificationStub = NotificationGrpc.newBlockingStub(channel);

	                // Prepare subscription request message
	                SubscriptionRequest subscriptionRequest = SubscriptionRequest.newBuilder().setSubscriptionEmail(email).build();

	                // Call the subscribe RPC and display a message indicating the subscription was successful
	                SubscriptionResponse subscriptionResponse = notificationStub.subscription(subscriptionRequest);
	                JOptionPane.showMessageDialog(null, subscriptionResponse.getSubscriptionConfirmation());

	            } catch (Exception ex) {
	                // Handle any exceptions that may occur
	                System.err.println("Error: " + ex.getMessage());
	            } finally {
	                // Shutdown channel
	                channel.shutdown();
	            }
	        }
	        else if (label.equals("Check Notification Received")) {
	            // Get the email address from the notificationEmail text field
	            String email = notificationEmail.getText();

	            // Establish channel
	            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();

	            try {
	                // Create stub
	                NotificationGrpc.NotificationBlockingStub notificationStub = NotificationGrpc.newBlockingStub(channel);

	                // Check if email is subscribed
	                if (!Server.getInstance().isSubscribed(email)) {
	                    JOptionPane.showMessageDialog(null, "Email not subscribed");
	                    return;
	                }

	                // Get the number of notifications received for the email
	                NotificationRequest notificationRequest = NotificationRequest.newBuilder().setNotificationEmail(email).build();
	                NotificationResponse notificationResponse = notificationStub.notify(notificationRequest);
	                int numNotifications = notificationResponse.getNumberOfNotifications();

	                // Display notification message
	                JOptionPane.showMessageDialog(null, String.format("You have received %d notification(s), please check for email from notification@smartpollution.ie", numNotifications));

	            } catch (Exception ex) {
	                // Handle any exceptions that may occur
	                System.err.println("Error: " + ex.getMessage());
	            } finally {
	                // Shutdown channel
	                channel.shutdown();
	            }
	        }
	        else if (label.equals("Get Data")) {
	            System.out.println("Pollution Data Service to be invoked...");

	            // Create a channel to connect to the server
	            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();

	            // Create a blocking stub for the Pollution Data Service
	            PollutionDataServiceGrpc.PollutionDataServiceBlockingStub blockingStub = PollutionDataServiceGrpc.newBlockingStub(channel);

	            // Prepare the request message to send
	            String area = pollutionArea.getText();
	            String monthName = pollutionMonth.getText();
	            GetMonthIndexRequest indexRequest = GetMonthIndexRequest.newBuilder()
	                    .setMonthName(monthName)
	                    .build();

	            // Retrieve the month index from the server
	            GetMonthIndexResponse indexResponse = blockingStub.getMonthIndex(indexRequest);
	            int month = indexResponse.getMonthIndex();
	            if (month == -1) {
	            	JOptionPane.showMessageDialog(null,"Invalid month entered");
	                return;
	            }
	            GetReadingsRequest readingsRequest = GetReadingsRequest.newBuilder()
	                    .setArea(area)
	                    .setMonth(month)
	                    .build();

	            // Retrieve the response from the server
	            GetReadingsResponse readingsResponse;
	            try {
	                readingsResponse = blockingStub.getReadings(readingsRequest);
	            } catch (StatusRuntimeException e1) {
	                pollutionData.setText("Error communicating with server: " + e1.getStatus().getDescription());
	                return;
	            }

	            // Display the pollution data in the UI
	            float airPollution = 0.0f;
	            float waterPollution = 0.0f;
	            switch (area) {
	                case "Dublin":
	                    airPollution = readingsResponse.getDublinAirPollution();
	                    waterPollution = readingsResponse.getDublinWaterPollution();
	                    break;
	                case "Cork":
	                    airPollution = readingsResponse.getCorkAirPollution();
	                    waterPollution = readingsResponse.getCorkWaterPollution();
	                    break;
	                default:
	                	JOptionPane.showMessageDialog(null,"Invalid area entered");
	                    return;
	            }
	            
	            // Prepare the request message to get statistics
	            GetStatisticsRequest statisticsRequest = GetStatisticsRequest.newBuilder()
	                    .setArea(area)
	                    .build();

	            // Retrieve the response from the server
	            GetStatisticsResponse statisticsResponse;
	            try {
	                statisticsResponse = blockingStub.getStatistics(statisticsRequest);
	            } catch (StatusRuntimeException e2) {
	                pollutionData.setText("Error communicating with server: " + e2.getStatus().getDescription());
	                return;
	            }

	         // Create a new text area to display the pollution data
	            JTextArea responseTextArea = new JTextArea("Pollution data for: "+ area + " in " + monthName + " Air Pollution: " + airPollution + ", Water Pollution: " + waterPollution);
	            responseTextArea.setEditable(false);
	            responseTextArea.setLineWrap(true);
	            responseTextArea.setWrapStyleWord(true);

	            // Display the pollution statistics in the UI
	            float averageAirPollution = statisticsResponse.getAverageAirPollution();
	            float minimumAirPollution = statisticsResponse.getMinimumAirPollution();
	            float maximumAirPollution = statisticsResponse.getMaximumAirPollution();
	            float averageWaterPollution = statisticsResponse.getAverageWaterPollution();
	            float minimumWaterPollution = statisticsResponse.getMinimumWaterPollution();
	            float maximumWaterPollution = statisticsResponse.getMaximumWaterPollution();
	            String statisticsMessage = "Air and Water Pollution Statistic for " + area + " in 2022" + "\n" +
	            						   "Air Pollution:\n" +
	                                       " - Average: " + averageAirPollution + "\n" +
	                                       " - Minimum: " + minimumAirPollution + "\n" +
	                                       " - Maximum: " + maximumAirPollution + "\n" +
	                                       "Water Pollution:\n" +
	                                       " - Average: " + averageWaterPollution + "\n" +
	                                       " - Minimum: " + minimumWaterPollution + "\n" +
	                                       " - Maximum: " + maximumWaterPollution;
	            JTextArea statisticsTextArea = new JTextArea();
	            statisticsTextArea.setText(statisticsMessage);
	            statisticsTextArea.setEditable(false);

	            // Create a panel to display both the pollution data and statistics
	            JPanel panel = new JPanel(new GridLayout(2, 1));
	            panel.add(new JScrollPane(responseTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
	            panel.add(new JScrollPane(statisticsTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));

	            // Set the preferred size of the scroll panes
	            Dimension scrollPaneSize = new Dimension(500, 250);
	            panel.getComponent(0).setPreferredSize(scrollPaneSize);
	            panel.getComponent(1).setPreferredSize(scrollPaneSize);

	            // Display the panel in a separate dialog box
	            JOptionPane.showMessageDialog(null, panel, "Pollution Data and Statistics", JOptionPane.PLAIN_MESSAGE, null);

	            // Close the channel
	            channel.shutdown();
	        }
		}
}