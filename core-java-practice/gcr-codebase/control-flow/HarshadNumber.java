import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("number: ");
        int n = sc.nextInt();

        int sum = 0;
        int tmp = n;

        while (tmp != 0) {
            int digit = tmp % 10;
            sum = sum + digit;
            tmp = tmp / 10;
        }

        if (n % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
    }
}
