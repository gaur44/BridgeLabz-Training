import java.util.*;

public class EmailNotifications {

    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
            "agraj@test.com", "mukul@test.com", "harsh@test.com"
        );

        emails.forEach(email -> sendEmailNotification(email));
    }

    static void sendEmailNotification(String email) {
        System.out.println("Sending email to " + email);
    }
}
