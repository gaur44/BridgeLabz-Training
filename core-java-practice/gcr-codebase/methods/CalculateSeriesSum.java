import java.util.Scanner;

public class CalculateSeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of n: ");
        int n = sc.nextInt();
        double total = 0;
        for (int i = 1; i <= n; i++) {
            total += 1.0 / i;
        }
        System.out.printf("sum of series: %.2f%n", total);
        sc.close();
    }
}