import java.util.*;

public class InvoiceGenerator {
    static String[] parseInvoice(String input) {
        return input.split(",");
    }

    static int getTotalAmount(String[] tasks) {
        int total = 0;

        for (String task : tasks) {
            String[] parts = task.split("-");

            String amountPart = parts[1].trim();
            String numberOnly = amountPart.split(" ")[0];

            int amount = Integer.parseInt(numberOnly);
            total += amount;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter invoice details:");
        String input = sc.nextLine();

        String[] tasks = parseInvoice(input);
        int total = getTotalAmount(tasks);

        System.out.println();
        System.out.println("Tasks:");
        for (String t : tasks) {
            System.out.println("- " + t.trim());
        }

        System.out.println();
        System.out.println("Total Invoice Amount: " + total);
        sc.close();
    }
}
