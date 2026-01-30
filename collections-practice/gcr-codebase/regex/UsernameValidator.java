import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class UsernameValidator {
    public static boolean isValidUsername(String s) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9_]+");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String username;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        username = scanner.nextLine();
        scanner.close();

        boolean isValid = UsernameValidator.isValidUsername(username);

        if (isValid) {
            System.out.println("Valid Username");
        }
        else {
            System.out.println("Invalid Username");
        }
    }
}
