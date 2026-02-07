import java.util.*;

public class EventWelcomeMessage {
    public static void main(String[] args) {

        List<String> attendees = Arrays.asList(
            "Amit", "Harsh", "Agraj"
        );

        attendees.forEach(name ->
            System.out.println("Welcome " + name)
        );
    }
}
