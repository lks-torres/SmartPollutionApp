package ca.pollutionData;

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
    comments = "Source: pollutionData.proto")
public final class PollutionDataServiceGrpc {

  private PollutionDataServiceGrpc() {}

  public static final String SERVICE_NAME = "pollutionData.PollutionDataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ca.pollutionData.GetReadingsRequest,
      ca.pollutionData.GetReadingsResponse> getGetReadingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReadings",
      requestType = ca.pollutionData.GetReadingsRequest.class,
      responseType = ca.pollutionData.GetReadingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ca.pollutionData.GetReadingsRequest,
      ca.pollutionData.GetReadingsResponse> getGetReadingsMethod() {
    io.grpc.MethodDescriptor<ca.pollutionData.GetReadingsRequest, ca.pollutionData.GetReadingsResponse> getGetReadingsMethod;
    if ((getGetReadingsMethod = PollutionDataServiceGrpc.getGetReadingsMethod) == null) {
      synchronized (PollutionDataServiceGrpc.class) {
        if ((getGetReadingsMethod = PollutionDataServiceGrpc.getGetReadingsMethod) == null) {
          PollutionDataServiceGrpc.getGetReadingsMethod = getGetReadingsMethod = 
              io.grpc.MethodDescriptor.<ca.pollutionData.GetReadingsRequest, ca.pollutionData.GetReadingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "pollutionData.PollutionDataService", "GetReadings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ca.pollutionData.GetReadingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ca.pollutionData.GetReadingsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PollutionDataServiceMethodDescriptorSupplier("GetReadings"))
                  .build();
          }
        }
     }
     return getGetReadingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ca.pollutionData.GetMonthIndexRequest,
      ca.pollutionData.GetMonthIndexResponse> getGetMonthIndexMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMonthIndex",
      requestType = ca.pollutionData.GetMonthIndexRequest.class,
      responseType = ca.pollutionData.GetMonthIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ca.pollutionData.GetMonthIndexRequest,
      ca.pollutionData.GetMonthIndexResponse> getGetMonthIndexMethod() {
    io.grpc.MethodDescriptor<ca.pollutionData.GetMonthIndexRequest, ca.pollutionData.GetMonthIndexResponse> getGetMonthIndexMethod;
    if ((getGetMonthIndexMethod = PollutionDataServiceGrpc.getGetMonthIndexMethod) == null) {
      synchronized (PollutionDataServiceGrpc.class) {
        if ((getGetMonthIndexMethod = PollutionDataServiceGrpc.getGetMonthIndexMethod) == null) {
          PollutionDataServiceGrpc.getGetMonthIndexMethod = getGetMonthIndexMethod = 
              io.grpc.MethodDescriptor.<ca.pollutionData.GetMonthIndexRequest, ca.pollutionData.GetMonthIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "pollutionData.PollutionDataService", "GetMonthIndex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ca.pollutionData.GetMonthIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ca.pollutionData.GetMonthIndexResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PollutionDataServiceMethodDescriptorSupplier("GetMonthIndex"))
                  .build();
          }
        }
     }
     return getGetMonthIndexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ca.pollutionData.GetStatisticsRequest,
      ca.pollutionData.GetStatisticsResponse> getGetStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStatistics",
      requestType = ca.pollutionData.GetStatisticsRequest.class,
      responseType = ca.pollutionData.GetStatisticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ca.pollutionData.GetStatisticsRequest,
      ca.pollutionData.GetStatisticsResponse> getGetStatisticsMethod() {
    io.grpc.MethodDescriptor<ca.pollutionData.GetStatisticsRequest, ca.pollutionData.GetStatisticsResponse> getGetStatisticsMethod;
    if ((getGetStatisticsMethod = PollutionDataServiceGrpc.getGetStatisticsMethod) == null) {
      synchronized (PollutionDataServiceGrpc.class) {
        if ((getGetStatisticsMethod = PollutionDataServiceGrpc.getGetStatisticsMethod) == null) {
          PollutionDataServiceGrpc.getGetStatisticsMethod = getGetStatisticsMethod = 
              io.grpc.MethodDescriptor.<ca.pollutionData.GetStatisticsRequest, ca.pollutionData.GetStatisticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "pollutionData.PollutionDataService", "GetStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ca.pollutionData.GetStatisticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ca.pollutionData.GetStatisticsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PollutionDataServiceMethodDescriptorSupplier("GetStatistics"))
                  .build();
          }
        }
     }
     return getGetStatisticsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PollutionDataServiceStub newStub(io.grpc.Channel channel) {
    return new PollutionDataServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PollutionDataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PollutionDataServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PollutionDataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PollutionDataServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PollutionDataServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getReadings(ca.pollutionData.GetReadingsRequest request,
        io.grpc.stub.StreamObserver<ca.pollutionData.GetReadingsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetReadingsMethod(), responseObserver);
    }

    /**
     */
    public void getMonthIndex(ca.pollutionData.GetMonthIndexRequest request,
        io.grpc.stub.StreamObserver<ca.pollutionData.GetMonthIndexResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMonthIndexMethod(), responseObserver);
    }

    /**
     */
    public void getStatistics(ca.pollutionData.GetStatisticsRequest request,
        io.grpc.stub.StreamObserver<ca.pollutionData.GetStatisticsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatisticsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetReadingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ca.pollutionData.GetReadingsRequest,
                ca.pollutionData.GetReadingsResponse>(
                  this, METHODID_GET_READINGS)))
          .addMethod(
            getGetMonthIndexMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ca.pollutionData.GetMonthIndexRequest,
                ca.pollutionData.GetMonthIndexResponse>(
                  this, METHODID_GET_MONTH_INDEX)))
          .addMethod(
            getGetStatisticsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ca.pollutionData.GetStatisticsRequest,
                ca.pollutionData.GetStatisticsResponse>(
                  this, METHODID_GET_STATISTICS)))
          .build();
    }
  }

  /**
   */
  public static final class PollutionDataServiceStub extends io.grpc.stub.AbstractStub<PollutionDataServiceStub> {
    private PollutionDataServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PollutionDataServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PollutionDataServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PollutionDataServiceStub(channel, callOptions);
    }

    /**
     */
    public void getReadings(ca.pollutionData.GetReadingsRequest request,
        io.grpc.stub.StreamObserver<ca.pollutionData.GetReadingsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetReadingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMonthIndex(ca.pollutionData.GetMonthIndexRequest request,
        io.grpc.stub.StreamObserver<ca.pollutionData.GetMonthIndexResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMonthIndexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStatistics(ca.pollutionData.GetStatisticsRequest request,
        io.grpc.stub.StreamObserver<ca.pollutionData.GetStatisticsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStatisticsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PollutionDataServiceBlockingStub extends io.grpc.stub.AbstractStub<PollutionDataServiceBlockingStub> {
    private PollutionDataServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PollutionDataServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PollutionDataServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PollutionDataServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ca.pollutionData.GetReadingsResponse getReadings(ca.pollutionData.GetReadingsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetReadingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ca.pollutionData.GetMonthIndexResponse getMonthIndex(ca.pollutionData.GetMonthIndexRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMonthIndexMethod(), getCallOptions(), request);
    }

    /**
     */
    public ca.pollutionData.GetStatisticsResponse getStatistics(ca.pollutionData.GetStatisticsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStatisticsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PollutionDataServiceFutureStub extends io.grpc.stub.AbstractStub<PollutionDataServiceFutureStub> {
    private PollutionDataServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PollutionDataServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PollutionDataServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PollutionDataServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ca.pollutionData.GetReadingsResponse> getReadings(
        ca.pollutionData.GetReadingsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetReadingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ca.pollutionData.GetMonthIndexResponse> getMonthIndex(
        ca.pollutionData.GetMonthIndexRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMonthIndexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ca.pollutionData.GetStatisticsResponse> getStatistics(
        ca.pollutionData.GetStatisticsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStatisticsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_READINGS = 0;
  private static final int METHODID_GET_MONTH_INDEX = 1;
  private static final int METHODID_GET_STATISTICS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PollutionDataServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PollutionDataServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_READINGS:
          serviceImpl.getReadings((ca.pollutionData.GetReadingsRequest) request,
              (io.grpc.stub.StreamObserver<ca.pollutionData.GetReadingsResponse>) responseObserver);
          break;
        case METHODID_GET_MONTH_INDEX:
          serviceImpl.getMonthIndex((ca.pollutionData.GetMonthIndexRequest) request,
              (io.grpc.stub.StreamObserver<ca.pollutionData.GetMonthIndexResponse>) responseObserver);
          break;
        case METHODID_GET_STATISTICS:
          serviceImpl.getStatistics((ca.pollutionData.GetStatisticsRequest) request,
              (io.grpc.stub.StreamObserver<ca.pollutionData.GetStatisticsResponse>) responseObserver);
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

  private static abstract class PollutionDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PollutionDataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ca.pollutionData.PollutionDataProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PollutionDataService");
    }
  }

  private static final class PollutionDataServiceFileDescriptorSupplier
      extends PollutionDataServiceBaseDescriptorSupplier {
    PollutionDataServiceFileDescriptorSupplier() {}
  }

  private static final class PollutionDataServiceMethodDescriptorSupplier
      extends PollutionDataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PollutionDataServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PollutionDataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PollutionDataServiceFileDescriptorSupplier())
              .addMethod(getGetReadingsMethod())
              .addMethod(getGetMonthIndexMethod())
              .addMethod(getGetStatisticsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
