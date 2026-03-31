import java.util.Scanner;

public class QuotientAndRemainder {
    // calculate quotient and remainder
    public static int[] calculateQuotientAndRemainder(int dividend, int divisor) {
        return new int[]{dividend / divisor, dividend % divisor};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input dividend: ");
        int dividend = sc.nextInt();
        System.out.print("input divisor: ");
        int divisor = sc.nextInt();
        int[] result = calculateQuotientAndRemainder(dividend, divisor);
        System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);
        sc.close();
    }
}