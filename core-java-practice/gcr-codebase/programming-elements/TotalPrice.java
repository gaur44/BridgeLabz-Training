import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        double unitPrice;
        int quantity;
        Scanner sc = new Scanner(System.in);
        System.out.print("Unit Price: ");
        unitPrice = sc.nextDouble();
        System.out.print("Quantity: ");
        quantity = sc.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and the unit price is INR " + unitPrice);
    }
}
