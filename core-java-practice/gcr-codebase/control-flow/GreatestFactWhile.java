import java.util.Scanner;

public class GreatestFactWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int greatestFact = 1;
        int count = n - 1;

        while (count >= 1) {
            if (n % count == 0) {
                greatestFact = count;
                break;
            }
            count--;
        }

        System.out.println("Greatest factor of " + n + " (beside itself): " + greatestFact);
    }
}
