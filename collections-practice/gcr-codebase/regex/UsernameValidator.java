import java.util.Scanner;

public class UsernameValidator {
    public static boolean isValidUsername(String s) {
        return s.matches("[a-zA-Z0-9_]+");
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
