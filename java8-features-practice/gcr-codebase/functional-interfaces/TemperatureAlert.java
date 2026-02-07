import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {

        double threshold = 37.5;

        Predicate<Double> isHighTemperature =
                temp -> temp > threshold;

        double currentTemp = 38.2;

        if (isHighTemperature.test(currentTemp)) {
            System.out.println("Temperature Alert!");
        } else {
            System.out.println("Temperature is normal");
        }
    }
}

