import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] factors = new int[n];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        System.out.println("Factors:");

        for (int i = 0; i < index; i++) {
            System.out.println(factors[i]);
        }
    }
}
