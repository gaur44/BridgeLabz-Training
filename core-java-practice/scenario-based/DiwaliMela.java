import java.util.Scanner;
import java.util.InputMismatchException;

public class DiwaliMela {
    public static boolean giftWon(int n) {
        return ((n % 3 == 0) && (n % 5 == 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int draw;
            try {
                System.out.print("Draw a number: (-1 to exit) ");
                draw = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Not a Number");
                sc.nextLine();
                continue;
            }
            if (draw < 0) {
                break;
            }
            if (giftWon(draw)) {
                System.out.println("You won a gift!");
            } else {
                System.out.println("Sorry! Better Luck Next Time.");
            }

        }
        sc.close();
    }
}
