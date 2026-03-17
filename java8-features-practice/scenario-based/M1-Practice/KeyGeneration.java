import java.util.*;

public class KeyGeneration {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();

            String result = process(input);

            if (result != null) {
                System.out.println("The generated key is - " + result);
            }
        }

        sc.close();
    }

    private static String process(String s) {

        if (s == null || s.length() == 0) {
            System.out.println("Invalid Input (empty string)");
            return null;
        }

        if (s.length() < 6) {
            System.out.println("Invalid Input (length < 6)");
            return null;
        }

        if (s.contains(" ")) {
            System.out.println("Invalid Input (contains space)");
            return null;
        }

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                System.out.println("Invalid Input (contains digits)");
                return null;
            }
            if (!Character.isLetter(ch)) {
                System.out.println("Invalid Input (contains special character)");
                return null;
            }
        }

        s = s.toLowerCase();

        StringBuilder filtered = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if ((int) ch % 2 != 0) {
                filtered.append(ch);
            }
        }

        filtered.reverse();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < filtered.length(); i++) {
            char ch = filtered.charAt(i);

            if (i % 2 == 0) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
