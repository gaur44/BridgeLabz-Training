import java.util.*;

public class SensorReadings {
    public static void main(String[] args) {

        List<Double> readings = Arrays.asList(
            22.5, 30.2, 18.9, 35.0, 25.6
        );

        double threshold = 25.0;

        readings.stream()
                .filter(r -> r > threshold)
                .forEach(r -> System.out.println(r));
    }
}
