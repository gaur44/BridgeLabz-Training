import java.util.Scanner;

public class UpperCaseConversion {

    static String toUpperCaseManual(String text) {
        String upper = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            upper = upper + ch;
        }
        return upper;
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
        String str = sc.nextLine();
        String upperCaseManual = toUpperCaseManual(str);
        String builtInUpper = str.toUpperCase();
        boolean result = compareStrings(upperCaseManual, builtInUpper);
        System.out.println(result);
    }
}
