import java.time.*;
import java.util.*;

public class EnergyMonitor {

    Map<LocalDate, List<Double>> data = new HashMap<>();

    public void addReading(LocalDate date, double value)
            throws InvalidEnergyReadingException {

        if (value < 0) {
            throw new InvalidEnergyReadingException("Reading cannot be negative");
        }

        data.putIfAbsent(date, new ArrayList<>());
        data.get(date).add(value);
    }

    public double dailyAverage(LocalDate date) {
        List<Double> list = data.get(date);
        if (list == null || list.isEmpty()) return 0;

        double sum = 0;
        for (double v : list) sum += v;
        return sum / list.size();
    }

    public double monthlyAverage(int year, int month) {
        double sum = 0;
        int count = 0;

        for (LocalDate d : data.keySet()) {
            if (d.getYear() == year && d.getMonthValue() == month) {
                for (double v : data.get(d)) {
                    sum += v;
                    count++;
                }
            }
        }

        return count == 0 ? 0 : sum / count;
    }

    public void report() {
        for (LocalDate d : data.keySet()) {
            System.out.println(d + " avg = " + dailyAverage(d));
        }
    }
}
