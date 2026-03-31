import java.util.Scanner;

public class SumNaturalNums {
    public static int sumNaturalNums(int n) {
        int sum = 0;

        // loop to calculate sum
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        System.out.println("sum of first " + n + " natural numbers is " + sumNaturalNums(n));
        sc.close();
    }
}