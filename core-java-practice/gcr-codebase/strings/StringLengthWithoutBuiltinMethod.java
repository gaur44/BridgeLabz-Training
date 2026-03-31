import java.util.Scanner;

public class StringLengthWithoutBuiltinMethod {
    // calculate the length
    static int findLength(String text) {
        int len = 0;
        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (RuntimeException e) {
            return len;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int customLength = findLength(str);
        int builtInLength = str.length();
        System.out.println("length using custom method : " + customLength);
        System.out.println("length using built-in method: " + builtInLength);
    }
}
