import java.util.Scanner;

public class ToggleCaseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a string: ");
        String input = scanner.nextLine();

        String toggled = toggleCase(input);

        System.out.println("toggled case string: " + toggled);

        scanner.close();
    }

    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
            } else if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
