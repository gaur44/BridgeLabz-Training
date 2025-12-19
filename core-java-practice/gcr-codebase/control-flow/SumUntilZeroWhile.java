import java.util.Scanner;

public class SumUntilZeroWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;
        System.out.print("number (0 to stop): ");
        double inputValue = sc.nextDouble();

        while (inputValue != 0.0) {
            total += inputValue;
            System.out.print("number (0 to stop): ");
            inputValue = sc.nextDouble();
        }

        System.out.println("Total sum is: " + total);

        sc.close();
    }
}
