package ca.pollutionData;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class PollutionDataServer extends PollutionDataServiceGrpc.PollutionDataServiceImplBase {

    private final int[] dublinAirPollution = {55, 60, 48, 63, 69, 67, 62, 55, 53, 47, 45, 43};
    private final int[] corkAirPollution = {53, 55, 45, 60, 64, 62, 54, 51, 45, 42, 38, 39};
    private final int[] dublinWaterPollution = {29, 33, 31, 25, 26, 30, 35, 32, 30, 27, 25, 23};
    private final int[] corkWaterPollution = {29, 33, 31, 25, 26, 30, 35, 32, 30, 27, 25, 23};

    @Override
    public void getReadings(GetReadingsRequest request, StreamObserver<GetReadingsResponse> responseObserver) {
        String area = request.getArea();
        int month = request.getMonth();
        if (month < 0 || month > 11) {
            responseObserver.onError(new IllegalArgumentException("Invalid month"));
            return;
        }
        int airPollution = 0;
        int waterPollution = 0;
        switch (area) {
            case "Dublin":
                airPollution = dublinAirPollution[month];
                waterPollution = dublinWaterPollution[month];
                break;
            case "Cork":
                airPollution = corkAirPollution[month];
                waterPollution = corkWaterPollution[month];
                break;
            default:
                responseObserver.onError(new IllegalArgumentException("Invalid area"));
                return;
        }
        GetReadingsResponse response = GetReadingsResponse.newBuilder()
                .setDublinAirPollution(dublinAirPollution[month])
                .setDublinWaterPollution(dublinWaterPollution[month])
                .setCorkAirPollution(corkAirPollution[month])
                .setCorkWaterPollution(corkWaterPollution[month])
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getMonthIndex(GetMonthIndexRequest request, StreamObserver<GetMonthIndexResponse> responseObserver) {
        String monthName = request.getMonthName().toLowerCase();
        int monthIndex = getMonthIndex(monthName);
        GetMonthIndexResponse response = GetMonthIndexResponse.newBuilder()
                .setMonthIndex(monthIndex)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private int getMonthIndex(String monthName) {
        switch (monthName) {
            case "january":
                return 0;
            case "february":
                return 1;
            case "march":
                return 2;
            case "april":
                return 3;
            case "may":
                return 4;
            case "june":
                return 5;
            case "july":
                return 6;
            case "august":
                return 7;
            case "september":
                return 8;
            case "october":
                return 9;
            case "november":
                return 10;
       case "december":
                return 11;
            default:
                return -1;
        }
    }
@Override
public void getStatistics(GetStatisticsRequest request, StreamObserver<GetStatisticsResponse> responseObserver) {
String area = request.getArea();
int[] airPollutionData = null;
int[] waterPollutionData = null;
if (area.equals("Dublin")) {
airPollutionData = dublinAirPollution;
waterPollutionData = dublinWaterPollution;
} else if (area.equals("Cork")) {
airPollutionData = corkAirPollution;
waterPollutionData = corkWaterPollution;
} else {
responseObserver.onNext(GetStatisticsResponse.newBuilder()
.setErrorMessage("Area not found")
.build());
responseObserver.onCompleted();
return;
}
float averageAirPollution = getAverage(airPollutionData);
float minAirPollution = getMin(airPollutionData);
float maxAirPollution = getMax(airPollutionData);
float averageWaterPollution = getAverage(waterPollutionData);
float minWaterPollution = getMin(waterPollutionData);
float maxWaterPollution = getMax(waterPollutionData);
GetStatisticsResponse response = GetStatisticsResponse.newBuilder()
.setAverageAirPollution(averageAirPollution)
.setMinimumAirPollution(minAirPollution)
.setMaximumAirPollution(maxAirPollution)
.setAverageWaterPollution(averageWaterPollution)
.setMinimumWaterPollution(minWaterPollution)
.setMaximumWaterPollution(maxWaterPollution)
.build();
responseObserver.onNext(response);
responseObserver.onCompleted();
}
private float getAverage(int[] data) {
int sum = 0;
for (int i : data) {
sum += i;
}
return (float) sum / data.length;
}
private int getMin(int[] data) {
int min = data[0];
for (int i = 1; i < data.length; i++) {
if (data[i] < min) {
min = data[i];
}
}
return min;
}
private int getMax(int[] data) {
int max = data[0];
for (int i = 1; i < data.length; i++) {
if (data[i] > max) {
max = data[i];
}
}
return max;
}
public static void main(String args []) throws IOException, InterruptedException {
Server server = ServerBuilder.forPort(8080)
.addService(new PollutionDataServer())
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