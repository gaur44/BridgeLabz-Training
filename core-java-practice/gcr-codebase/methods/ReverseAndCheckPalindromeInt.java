import java.util.Scanner;

public class ReverseAndCheckPalindromeInt {
    public static boolean isPalindrome(int num) {
        int orig = num, rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return orig == rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = scanner.nextInt();
        boolean result = isPalindrome(num);
        System.out.println("is palindrome: " + result);
        scanner.close();
    }
}