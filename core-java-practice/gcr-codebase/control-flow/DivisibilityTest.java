import java.util.Scanner;

public class DivisibilityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int n = sc.nextInt();

        boolean isDivisible;
        if (n % 5 == 0) {
            isDivisible = true;
        } else {
            isDivisible = false;
        }

        System.out.println("Is the number " + n + " divisible by 5? " + isDivisible);

        sc.close();
    }
}
