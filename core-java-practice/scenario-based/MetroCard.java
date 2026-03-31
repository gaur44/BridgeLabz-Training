import java.util.Scanner;

public class MetroCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter card balance: Rs.");
        double balance = sc.nextDouble();

        while (balance > 0) {
            System.out.println();
            System.out.println("Balance: Rs." + balance);
            System.out.print("Enter distance (km) or 0 to exit: ");
            int dist = sc.nextInt();

            if (dist == 0) {
                break;
            }

            // calculate fare based on distance using ternary operator
            int fare = (dist <= 5) ? 10 : (dist <= 10) ? 20 : (dist <= 15) ? 30 : 50;

            if (balance >= fare) {
                balance = balance - fare;
                System.out.println("Fare: Rs." + fare + " | Remaining: Rs." + balance);
            } else {
                System.out.println("Insufficient balance!");
                break;
            }
        }

        System.out.println("Final balance: Rs." + balance);
        sc.close();
    }
}