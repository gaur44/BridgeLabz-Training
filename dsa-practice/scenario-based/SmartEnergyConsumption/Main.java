import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        EnergyMonitor monitor = new EnergyMonitor();

        try {
            monitor.addReading(LocalDate.of(2026, 2, 10), 10.5);
            monitor.addReading(LocalDate.of(2026, 2, 10), 12.0);
            monitor.addReading(LocalDate.of(2026, 2, 11), 9.0);
            monitor.addReading(LocalDate.of(2026, 2, 11), -2);  // invalid
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        monitor.report();

        System.out.println("Monthly avg: " +
                monitor.monthlyAverage(2026, 2));
    }
}
