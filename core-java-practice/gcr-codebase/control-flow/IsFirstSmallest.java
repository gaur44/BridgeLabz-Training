import java.util.Scanner;

public class IsFirstSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("number 2: ");
        int num2 = scanner.nextInt();

        System.out.print("number 3: ");
        int num3 = scanner.nextInt();

        boolean isSmallest;
        if (num1 <= num2 && num1 <= num3) {
            isSmallest = true;
        } else {
            isSmallest = false;
        }

        System.out.println("Is the first number the smallest? " + isSmallest);

        scanner.close();
    }
}
