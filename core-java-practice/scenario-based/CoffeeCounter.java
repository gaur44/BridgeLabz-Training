import java.util.Scanner;

public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter coffee type (espresso/latte/cappuccino) or exit: ");
            String coffee = sc.next();

            if (coffee.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("quantity: ");
            int quantity = sc.nextInt();

            double price = 0;

            switch (coffee) {
                case "espresso":
                    price = 120;
                    break;
                case "latte":
                    price = 150;
                    break;
                case "cappuccino":
                    price = 180;
                    break;
                default:
                    System.out.println("invalid coffee type");
                    continue;
            }

            double total = price * quantity;
            double bill = total + (total * 0.05);

            System.out.println("bill: " + bill);
        }

        sc.close();
    }
}
