import java.util.*;

public class TemperatureLog {
    private List<Double> readings = new ArrayList<>();
    private double minSafe;
    private double maxSafe;

    public TemperatureLog(double minSafe, double maxSafe) {
        this.minSafe = minSafe;
        this.maxSafe = maxSafe;
    }

    public void addReading(double temp) throws SensorFailureException {
        if (temp < -100 || temp > 100)
            throw new SensorFailureException("Sensor error: invalid reading " + temp);

        readings.add(temp);

        if (temp < minSafe || temp > maxSafe)
            System.out.println("Alert: Unsafe temperature " + temp);
    }

    public double average() {
        if (readings.isEmpty()) return 0;
        double sum = 0;
        for (double t : readings)
            sum += t;
        return sum / readings.size();
    }
}
