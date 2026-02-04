import java.util.function.Predicate;

public class NotificationFilter {
    public static void main(String[] args) {

        String[] alerts = {
            "EMERGENCY: Heart rate high",
            "INFO: Appointment reminder",
            "WARNING: Blood pressure rising"
        };

        // filter important alerts
        Predicate<String> isImportant = a ->
                a.startsWith("EMERGENCY") || a.startsWith("WARNING");

        for (String alert : alerts) {
            if (isImportant.test(alert))
                System.out.println(alert);
        }
    }
}
