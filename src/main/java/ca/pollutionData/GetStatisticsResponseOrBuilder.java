// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pollutionData.proto

package ca.pollutionData;

public interface GetStatisticsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pollutionData.GetStatisticsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>float average_air_pollution = 1;</code>
   */
  float getAverageAirPollution();

  /**
   * <code>float minimum_air_pollution = 2;</code>
   */
  float getMinimumAirPollution();

  /**
   * <code>float maximum_air_pollution = 3;</code>
   */
  float getMaximumAirPollution();

  /**
   * <code>float average_water_pollution = 4;</code>
   */
  float getAverageWaterPollution();

  /**
   * <code>float minimum_water_pollution = 5;</code>
   */
  float getMinimumWaterPollution();

  /**
   * <code>float maximum_water_pollution = 6;</code>
   */
  float getMaximumWaterPollution();

  /**
   * <code>string error_message = 7;</code>
   */
  java.lang.String getErrorMessage();
  /**
   * <code>string error_message = 7;</code>
   */
  com.google.protobuf.ByteString
      getErrorMessageBytes();
}