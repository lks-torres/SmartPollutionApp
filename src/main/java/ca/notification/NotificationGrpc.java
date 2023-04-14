package ca.notification;

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
    comments = "Source: Notification.proto")
public final class NotificationGrpc {

  private NotificationGrpc() {}

  public static final String SERVICE_NAME = "ca.userAuthentication.Notification";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ca.notification.SubscriptionRequest,
      ca.notification.SubscriptionResponse> getSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscription",
      requestType = ca.notification.SubscriptionRequest.class,
      responseType = ca.notification.SubscriptionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ca.notification.SubscriptionRequest,
      ca.notification.SubscriptionResponse> getSubscriptionMethod() {
    io.grpc.MethodDescriptor<ca.notification.SubscriptionRequest, ca.notification.SubscriptionResponse> getSubscriptionMethod;
    if ((getSubscriptionMethod = NotificationGrpc.getSubscriptionMethod) == null) {
      synchronized (NotificationGrpc.class) {
        if ((getSubscriptionMethod = NotificationGrpc.getSubscriptionMethod) == null) {
          NotificationGrpc.getSubscriptionMethod = getSubscriptionMethod = 
              io.grpc.MethodDescriptor.<ca.notification.SubscriptionRequest, ca.notification.SubscriptionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ca.userAuthentication.Notification", "Subscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ca.notification.SubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ca.notification.SubscriptionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NotificationMethodDescriptorSupplier("Subscription"))
                  .build();
          }
        }
     }
     return getSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ca.notification.NotificationRequest,
      ca.notification.NotificationResponse> getNotifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Notify",
      requestType = ca.notification.NotificationRequest.class,
      responseType = ca.notification.NotificationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ca.notification.NotificationRequest,
      ca.notification.NotificationResponse> getNotifyMethod() {
    io.grpc.MethodDescriptor<ca.notification.NotificationRequest, ca.notification.NotificationResponse> getNotifyMethod;
    if ((getNotifyMethod = NotificationGrpc.getNotifyMethod) == null) {
      synchronized (NotificationGrpc.class) {
        if ((getNotifyMethod = NotificationGrpc.getNotifyMethod) == null) {
          NotificationGrpc.getNotifyMethod = getNotifyMethod = 
              io.grpc.MethodDescriptor.<ca.notification.NotificationRequest, ca.notification.NotificationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ca.userAuthentication.Notification", "Notify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ca.notification.NotificationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ca.notification.NotificationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NotificationMethodDescriptorSupplier("Notify"))
                  .build();
          }
        }
     }
     return getNotifyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ca.notification.RequestMessage,
      ca.notification.ResponseMessage> getDoNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DoNotification",
      requestType = ca.notification.RequestMessage.class,
      responseType = ca.notification.ResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ca.notification.RequestMessage,
      ca.notification.ResponseMessage> getDoNotificationMethod() {
    io.grpc.MethodDescriptor<ca.notification.RequestMessage, ca.notification.ResponseMessage> getDoNotificationMethod;
    if ((getDoNotificationMethod = NotificationGrpc.getDoNotificationMethod) == null) {
      synchronized (NotificationGrpc.class) {
        if ((getDoNotificationMethod = NotificationGrpc.getDoNotificationMethod) == null) {
          NotificationGrpc.getDoNotificationMethod = getDoNotificationMethod = 
              io.grpc.MethodDescriptor.<ca.notification.RequestMessage, ca.notification.ResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ca.userAuthentication.Notification", "DoNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ca.notification.RequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ca.notification.ResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new NotificationMethodDescriptorSupplier("DoNotification"))
                  .build();
          }
        }
     }
     return getDoNotificationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NotificationStub newStub(io.grpc.Channel channel) {
    return new NotificationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotificationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NotificationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NotificationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NotificationFutureStub(channel);
  }

  /**
   */
  public static abstract class NotificationImplBase implements io.grpc.BindableService {

    /**
     */
    public void subscription(ca.notification.SubscriptionRequest request,
        io.grpc.stub.StreamObserver<ca.notification.SubscriptionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscriptionMethod(), responseObserver);
    }

    /**
     */
    public void notify(ca.notification.NotificationRequest request,
        io.grpc.stub.StreamObserver<ca.notification.NotificationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNotifyMethod(), responseObserver);
    }

    /**
     */
    public void doNotification(ca.notification.RequestMessage request,
        io.grpc.stub.StreamObserver<ca.notification.ResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getDoNotificationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubscriptionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ca.notification.SubscriptionRequest,
                ca.notification.SubscriptionResponse>(
                  this, METHODID_SUBSCRIPTION)))
          .addMethod(
            getNotifyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ca.notification.NotificationRequest,
                ca.notification.NotificationResponse>(
                  this, METHODID_NOTIFY)))
          .addMethod(
            getDoNotificationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ca.notification.RequestMessage,
                ca.notification.ResponseMessage>(
                  this, METHODID_DO_NOTIFICATION)))
          .build();
    }
  }

  /**
   */
  public static final class NotificationStub extends io.grpc.stub.AbstractStub<NotificationStub> {
    private NotificationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotificationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotificationStub(channel, callOptions);
    }

    /**
     */
    public void subscription(ca.notification.SubscriptionRequest request,
        io.grpc.stub.StreamObserver<ca.notification.SubscriptionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void notify(ca.notification.NotificationRequest request,
        io.grpc.stub.StreamObserver<ca.notification.NotificationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNotifyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void doNotification(ca.notification.RequestMessage request,
        io.grpc.stub.StreamObserver<ca.notification.ResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDoNotificationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NotificationBlockingStub extends io.grpc.stub.AbstractStub<NotificationBlockingStub> {
    private NotificationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotificationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotificationBlockingStub(channel, callOptions);
    }

    /**
     */
    public ca.notification.SubscriptionResponse subscription(ca.notification.SubscriptionRequest request) {
      return blockingUnaryCall(
          getChannel(), getSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public ca.notification.NotificationResponse notify(ca.notification.NotificationRequest request) {
      return blockingUnaryCall(
          getChannel(), getNotifyMethod(), getCallOptions(), request);
    }

    /**
     */
    public ca.notification.ResponseMessage doNotification(ca.notification.RequestMessage request) {
      return blockingUnaryCall(
          getChannel(), getDoNotificationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NotificationFutureStub extends io.grpc.stub.AbstractStub<NotificationFutureStub> {
    private NotificationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotificationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotificationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ca.notification.SubscriptionResponse> subscription(
        ca.notification.SubscriptionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ca.notification.NotificationResponse> notify(
        ca.notification.NotificationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNotifyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ca.notification.ResponseMessage> doNotification(
        ca.notification.RequestMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getDoNotificationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBSCRIPTION = 0;
  private static final int METHODID_NOTIFY = 1;
  private static final int METHODID_DO_NOTIFICATION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NotificationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NotificationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIPTION:
          serviceImpl.subscription((ca.notification.SubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<ca.notification.SubscriptionResponse>) responseObserver);
          break;
        case METHODID_NOTIFY:
          serviceImpl.notify((ca.notification.NotificationRequest) request,
              (io.grpc.stub.StreamObserver<ca.notification.NotificationResponse>) responseObserver);
          break;
        case METHODID_DO_NOTIFICATION:
          serviceImpl.doNotification((ca.notification.RequestMessage) request,
              (io.grpc.stub.StreamObserver<ca.notification.ResponseMessage>) responseObserver);
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

  private static abstract class NotificationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NotificationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ca.notification.NotificationProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Notification");
    }
  }

  private static final class NotificationFileDescriptorSupplier
      extends NotificationBaseDescriptorSupplier {
    NotificationFileDescriptorSupplier() {}
  }

  private static final class NotificationMethodDescriptorSupplier
      extends NotificationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NotificationMethodDescriptorSupplier(String methodName) {
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
      synchronized (NotificationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NotificationFileDescriptorSupplier())
              .addMethod(getSubscriptionMethod())
              .addMethod(getNotifyMethod())
              .addMethod(getDoNotificationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
