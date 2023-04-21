// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pollutionData.proto

package ca.pollutionData;

public final class PollutionDataProto {
  private PollutionDataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pollutionData_GetReadingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pollutionData_GetReadingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pollutionData_GetReadingsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pollutionData_GetReadingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pollutionData_GetMonthIndexRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pollutionData_GetMonthIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pollutionData_GetMonthIndexResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pollutionData_GetMonthIndexResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pollutionData_GetStatisticsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pollutionData_GetStatisticsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pollutionData_GetStatisticsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pollutionData_GetStatisticsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023pollutionData.proto\022\rpollutionData\"1\n\022" +
      "GetReadingsRequest\022\014\n\004area\030\001 \001(\t\022\r\n\005mont" +
      "h\030\002 \001(\005\"\215\001\n\023GetReadingsResponse\022\034\n\024dubli" +
      "n_air_pollution\030\001 \001(\005\022\036\n\026dublin_water_po" +
      "llution\030\002 \001(\005\022\032\n\022cork_air_pollution\030\003 \001(" +
      "\005\022\034\n\024cork_water_pollution\030\004 \001(\005\"*\n\024GetMo" +
      "nthIndexRequest\022\022\n\nmonth_name\030\001 \001(\t\",\n\025G" +
      "etMonthIndexResponse\022\023\n\013month_index\030\001 \001(" +
      "\005\"$\n\024GetStatisticsRequest\022\014\n\004area\030\001 \001(\t\"" +
      "\356\001\n\025GetStatisticsResponse\022\035\n\025average_air" +
      "_pollution\030\001 \001(\002\022\035\n\025minimum_air_pollutio" +
      "n\030\002 \001(\002\022\035\n\025maximum_air_pollution\030\003 \001(\002\022\037" +
      "\n\027average_water_pollution\030\004 \001(\002\022\037\n\027minim" +
      "um_water_pollution\030\005 \001(\002\022\037\n\027maximum_wate" +
      "r_pollution\030\006 \001(\002\022\025\n\rerror_message\030\007 \001(\t" +
      "2\252\002\n\024PollutionDataService\022V\n\013GetReadings" +
      "\022!.pollutionData.GetReadingsRequest\032\".po" +
      "llutionData.GetReadingsResponse\"\000\022\\\n\rGet" +
      "MonthIndex\022#.pollutionData.GetMonthIndex" +
      "Request\032$.pollutionData.GetMonthIndexRes" +
      "ponse\"\000\022\\\n\rGetStatistics\022#.pollutionData" +
      ".GetStatisticsRequest\032$.pollutionData.Ge" +
      "tStatisticsResponse\"\000B(\n\020ca.pollutionDat" +
      "aB\022PollutionDataProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_pollutionData_GetReadingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_pollutionData_GetReadingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pollutionData_GetReadingsRequest_descriptor,
        new java.lang.String[] { "Area", "Month", });
    internal_static_pollutionData_GetReadingsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_pollutionData_GetReadingsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pollutionData_GetReadingsResponse_descriptor,
        new java.lang.String[] { "DublinAirPollution", "DublinWaterPollution", "CorkAirPollution", "CorkWaterPollution", });
    internal_static_pollutionData_GetMonthIndexRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_pollutionData_GetMonthIndexRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pollutionData_GetMonthIndexRequest_descriptor,
        new java.lang.String[] { "MonthName", });
    internal_static_pollutionData_GetMonthIndexResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_pollutionData_GetMonthIndexResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pollutionData_GetMonthIndexResponse_descriptor,
        new java.lang.String[] { "MonthIndex", });
    internal_static_pollutionData_GetStatisticsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_pollutionData_GetStatisticsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pollutionData_GetStatisticsRequest_descriptor,
        new java.lang.String[] { "Area", });
    internal_static_pollutionData_GetStatisticsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_pollutionData_GetStatisticsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pollutionData_GetStatisticsResponse_descriptor,
        new java.lang.String[] { "AverageAirPollution", "MinimumAirPollution", "MaximumAirPollution", "AverageWaterPollution", "MinimumWaterPollution", "MaximumWaterPollution", "ErrorMessage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}