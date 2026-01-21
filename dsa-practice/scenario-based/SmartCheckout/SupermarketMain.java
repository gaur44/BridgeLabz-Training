package checkout;

import java.util.Arrays;

public class SupermarketMain {

    public static void main(String[] args) {

        CheckoutCounter counter = new CheckoutCounter();

        Customer c1 = new Customer("Aman",
                Arrays.asList("Milk", "Bread"));
        Customer c2 = new Customer("Neha",
                Arrays.asList("Eggs", "Milk", "Eggs"));

        counter.addCustomer(c1);
        counter.addCustomer(c2);

        counter.processCustomer();
        counter.processCustomer();
    }
}

