import java.util.Scanner;

public class CalculateFact {
    public static long factorial(int n) {
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Factorial of " + num + " is " + factorial(num));
        scanner.close();
    }
}