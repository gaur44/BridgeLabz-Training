import java.util.Scanner;

public class StringEqualityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter string 1: ");
        String str1 = scanner.next();

        System.out.print("enter string 2: ");
        String str2 = scanner.next();

        boolean charEqual = true;
        if (str1.length() != str2.length()) {
            charEqual = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    charEqual = false;
                    break;
                }
            }
        }

        boolean checkWithEquals = str1.equals(str2);

        System.out.println("Comparison using charAt: " + charEqual);
        System.out.println("Comparison using equals(): " + checkWithEquals);

        scanner.close();
    }
}
