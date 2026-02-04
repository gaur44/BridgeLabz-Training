import java.util.*;

class Invoice {
    int transactionId;

    Invoice(int transactionId) {
        this.transactionId = transactionId;
    }

    public String toString() {
        return "Invoice for Transaction ID: " + transactionId;
    }
}

public class InvoiceCreation {
    public static void main(String[] args) {

        List<Integer> transactionIds = Arrays.asList(5001, 5002, 5003);

        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)  
                .toList();

        invoices.forEach(System.out::println);
    }
}

