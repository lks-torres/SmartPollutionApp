package ca.userAuthentication;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class userAuthenticationServer extends userAuthenticationGrpc.userAuthenticationImplBase{
	
	private static final String EMAIL = "test@nci.ie";
    private static final String PASSWORD = "NCI2023";
    
	@Override
	public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
	        String loginEmail = request.getEmail();
	        String password = request.getPassword();

	        LoginStatus status = LoginStatus.INCORRECT_CREDENTIALS;

	        if (loginEmail.equalsIgnoreCase(EMAIL) && password.equals(PASSWORD)) {
	            status = LoginStatus.LOGGED_IN_SUCCESSFULLY;
	        }

	        LoginResponse response = LoginResponse.newBuilder()
	                .setStatus(status)
	                .setUserStatus("Offline") // Define standard value of the userStatus to Offline when initiating the server
	                .build();
	        
	        responseObserver.onNext(response); // Send response back to the client
	        responseObserver.onCompleted();
	}
	
    @Override
    public void logout(LogoutRequest request, StreamObserver<LogoutResponse> responseObserver) {
        String userStatus = request.getUserStatus();

        LogoutStatus status = LogoutStatus.INVALID_USERSTATUS;

        if (userStatus.equalsIgnoreCase("Online")) { // Check userStatus value
            status = LogoutStatus.LOGGED_OUT_SUCCESSFULLY;
        }

        LogoutResponse response = LogoutResponse.newBuilder()
                .setStatus(status)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

	
	public static void main(String args []) throws IOException, InterruptedException {
		Server server = ServerBuilder.forPort(8080)
				.addService(new userAuthenticationServer())
				.build();
		
		server.start();
		System.out.println("Server started");
		
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down server");
            server.shutdown();
        }));
        
        server.awaitTermination();
	}
}