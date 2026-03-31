import java.util.Scanner;

class InvalidInvoiceFormatException extends Exception {
    InvalidInvoiceFormatException(String m) {
        super(m);
    }
}

public class InvoiceAppWithException {

    static String[] parseInvoice(String s) throws InvalidInvoiceFormatException {
        if (!s.contains("-"))
            throw new InvalidInvoiceFormatException("Dash missing");
        return s.split(",");
    }

    static int getTotalAmount(String[] a) throws InvalidInvoiceFormatException {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].contains("-"))
                throw new InvalidInvoiceFormatException("Bad part: " + a[i]);

            String[] p = a[i].split("-");
            if (p.length < 2)
                throw new InvalidInvoiceFormatException("No amount");

            String num = p[1].trim().split(" ")[0];
            sum += Integer.parseInt(num);
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter invoice:");
        String in = sc.nextLine();

        try {
            String[] t = parseInvoice(in);
            int total = getTotalAmount(t);

            System.out.println("Total: " + total);

        } catch (InvalidInvoiceFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
