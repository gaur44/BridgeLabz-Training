import java.util.Scanner;

public class LowerCaseConversionCompare {

    static String lowerCaseManual(String text) {
        String lower = "";

        for (int i = 0; i < text.length(); i++) {
            char chr = text.charAt(i);

            if (chr >= 'A' && chr <= 'Z') {
                chr = (char) (chr + 32);
            }
            lower = lower + chr;
        }
        return lower;
    }

    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String manualLowerCase = lowerCaseManual(text);
        String builtInLowerCase = text.toLowerCase();
        boolean result = compareStrings(manualLowerCase, builtInLowerCase);
        System.out.println(result);
    }
}
