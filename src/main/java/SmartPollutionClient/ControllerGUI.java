package SmartPollutionClient;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import ca.notification.NotificationGrpc;
import ca.notification.NotificationRequest;
import ca.notification.NotificationResponse;
import ca.notification.NotificationServer;
import ca.notification.SubscriptionRequest;
import ca.notification.SubscriptionResponse;
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
	
public class ControllerGUI implements ActionListener{
	//Variables for userAuthentication services
	private String userStatus = "Offline";
	private String userEmail = "";
    private JTextField loginEmail, logoutEmail;
    private JPasswordField password, logout;
    private JLabel login;
    
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

        logout = new JPasswordField("", 10);
        logout.setEditable(false);
        panel.add(logout);

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

		public static void main(String[] args) {

			ControllerGUI gui = new ControllerGUI();

			gui.build();
		}

		private void build() { 

		    JFrame frame = new JFrame("Service Controller Sample");
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
	                SubscriptionRequest subscriptionRequest = SubscriptionRequest.newBuilder().setSubscriptionEmail(email).build();
	                SubscriptionResponse subscriptionResponse = notificationStub.subscription(subscriptionRequest);
	                String subscribedEmails = subscriptionResponse.getSubscriptionConfirmation();
	                if (!subscribedEmails.contains(email)) {
	                    JOptionPane.showMessageDialog(null, "Email not subscribed");
	                    return;
	                }

	                // Generate random number of notifications between 0 and 12 (inclusive)
	                int numNotifications = new Random().nextInt(13);

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
		}   
}