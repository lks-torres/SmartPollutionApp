package ca.userAuthentication;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: userAuthentication.proto")
public final class userAuthenticationGrpc {

  private userAuthenticationGrpc() {}

  public static final String SERVICE_NAME = "ca.userAuthentication.userAuthentication";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ca.userAuthentication.LoginRequest,
      ca.userAuthentication.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Login",
      requestType = ca.userAuthentication.LoginRequest.class,
      responseType = ca.userAuthentication.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ca.userAuthentication.LoginRequest,
      ca.userAuthentication.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<ca.userAuthentication.LoginRequest, ca.userAuthentication.LoginResponse> getLoginMethod;
    if ((getLoginMethod = userAuthenticationGrpc.getLoginMethod) == null) {
      synchronized (userAuthenticationGrpc.class) {
        if ((getLoginMethod = userAuthenticationGrpc.getLoginMethod) == null) {
          userAuthenticationGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<ca.userAuthentication.LoginRequest, ca.userAuthentication.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ca.userAuthentication.userAuthentication", "Login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ca.userAuthentication.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ca.userAuthentication.LoginResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userAuthenticationMethodDescriptorSupplier("Login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ca.userAuthentication.LogoutRequest,
      ca.userAuthentication.LogoutResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Logout",
      requestType = ca.userAuthentication.LogoutRequest.class,
      responseType = ca.userAuthentication.LogoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ca.userAuthentication.LogoutRequest,
      ca.userAuthentication.LogoutResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<ca.userAuthentication.LogoutRequest, ca.userAuthentication.LogoutResponse> getLogoutMethod;
    if ((getLogoutMethod = userAuthenticationGrpc.getLogoutMethod) == null) {
      synchronized (userAuthenticationGrpc.class) {
        if ((getLogoutMethod = userAuthenticationGrpc.getLogoutMethod) == null) {
          userAuthenticationGrpc.getLogoutMethod = getLogoutMethod = 
              io.grpc.MethodDescriptor.<ca.userAuthentication.LogoutRequest, ca.userAuthentication.LogoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ca.userAuthentication.userAuthentication", "Logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ca.userAuthentication.LogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ca.userAuthentication.LogoutResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userAuthenticationMethodDescriptorSupplier("Logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ca.userAuthentication.RequestMessage,
      ca.userAuthentication.ResponseMessage> getUserAuthenticationDoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "userAuthenticationDo",
      requestType = ca.userAuthentication.RequestMessage.class,
      responseType = ca.userAuthentication.ResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ca.userAuthentication.RequestMessage,
      ca.userAuthentication.ResponseMessage> getUserAuthenticationDoMethod() {
    io.grpc.MethodDescriptor<ca.userAuthentication.RequestMessage, ca.userAuthentication.ResponseMessage> getUserAuthenticationDoMethod;
    if ((getUserAuthenticationDoMethod = userAuthenticationGrpc.getUserAuthenticationDoMethod) == null) {
      synchronized (userAuthenticationGrpc.class) {
        if ((getUserAuthenticationDoMethod = userAuthenticationGrpc.getUserAuthenticationDoMethod) == null) {
          userAuthenticationGrpc.getUserAuthenticationDoMethod = getUserAuthenticationDoMethod = 
              io.grpc.MethodDescriptor.<ca.userAuthentication.RequestMessage, ca.userAuthentication.ResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ca.userAuthentication.userAuthentication", "userAuthenticationDo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ca.userAuthentication.RequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ca.userAuthentication.ResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new userAuthenticationMethodDescriptorSupplier("userAuthenticationDo"))
                  .build();
          }
        }
     }
     return getUserAuthenticationDoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userAuthenticationStub newStub(io.grpc.Channel channel) {
    return new userAuthenticationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userAuthenticationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userAuthenticationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userAuthenticationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userAuthenticationFutureStub(channel);
  }

  /**
   */
  public static abstract class userAuthenticationImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(ca.userAuthentication.LoginRequest request,
        io.grpc.stub.StreamObserver<ca.userAuthentication.LoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void logout(ca.userAuthentication.LogoutRequest request,
        io.grpc.stub.StreamObserver<ca.userAuthentication.LogoutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    /**
     */
    public void userAuthenticationDo(ca.userAuthentication.RequestMessage request,
        io.grpc.stub.StreamObserver<ca.userAuthentication.ResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getUserAuthenticationDoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ca.userAuthentication.LoginRequest,
                ca.userAuthentication.LoginResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ca.userAuthentication.LogoutRequest,
                ca.userAuthentication.LogoutResponse>(
                  this, METHODID_LOGOUT)))
          .addMethod(
            getUserAuthenticationDoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ca.userAuthentication.RequestMessage,
                ca.userAuthentication.ResponseMessage>(
                  this, METHODID_USER_AUTHENTICATION_DO)))
          .build();
    }
  }

  /**
   */
  public static final class userAuthenticationStub extends io.grpc.stub.AbstractStub<userAuthenticationStub> {
    private userAuthenticationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userAuthenticationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userAuthenticationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userAuthenticationStub(channel, callOptions);
    }

    /**
     */
    public void login(ca.userAuthentication.LoginRequest request,
        io.grpc.stub.StreamObserver<ca.userAuthentication.LoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(ca.userAuthentication.LogoutRequest request,
        io.grpc.stub.StreamObserver<ca.userAuthentication.LogoutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void userAuthenticationDo(ca.userAuthentication.RequestMessage request,
        io.grpc.stub.StreamObserver<ca.userAuthentication.ResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUserAuthenticationDoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class userAuthenticationBlockingStub extends io.grpc.stub.AbstractStub<userAuthenticationBlockingStub> {
    private userAuthenticationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userAuthenticationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userAuthenticationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userAuthenticationBlockingStub(channel, callOptions);
    }

    /**
     */
    public ca.userAuthentication.LoginResponse login(ca.userAuthentication.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public ca.userAuthentication.LogoutResponse logout(ca.userAuthentication.LogoutRequest request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }

    /**
     */
    public ca.userAuthentication.ResponseMessage userAuthenticationDo(ca.userAuthentication.RequestMessage request) {
      return blockingUnaryCall(
          getChannel(), getUserAuthenticationDoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class userAuthenticationFutureStub extends io.grpc.stub.AbstractStub<userAuthenticationFutureStub> {
    private userAuthenticationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userAuthenticationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userAuthenticationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userAuthenticationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ca.userAuthentication.LoginResponse> login(
        ca.userAuthentication.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ca.userAuthentication.LogoutResponse> logout(
        ca.userAuthentication.LogoutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ca.userAuthentication.ResponseMessage> userAuthenticationDo(
        ca.userAuthentication.RequestMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getUserAuthenticationDoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;
  private static final int METHODID_USER_AUTHENTICATION_DO = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userAuthenticationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userAuthenticationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((ca.userAuthentication.LoginRequest) request,
              (io.grpc.stub.StreamObserver<ca.userAuthentication.LoginResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((ca.userAuthentication.LogoutRequest) request,
              (io.grpc.stub.StreamObserver<ca.userAuthentication.LogoutResponse>) responseObserver);
          break;
        case METHODID_USER_AUTHENTICATION_DO:
          serviceImpl.userAuthenticationDo((ca.userAuthentication.RequestMessage) request,
              (io.grpc.stub.StreamObserver<ca.userAuthentication.ResponseMessage>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class userAuthenticationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userAuthenticationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ca.userAuthentication.userAuthenticationProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("userAuthentication");
    }
  }

  private static final class userAuthenticationFileDescriptorSupplier
      extends userAuthenticationBaseDescriptorSupplier {
    userAuthenticationFileDescriptorSupplier() {}
  }

  private static final class userAuthenticationMethodDescriptorSupplier
      extends userAuthenticationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userAuthenticationMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (userAuthenticationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userAuthenticationFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .addMethod(getUserAuthenticationDoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
