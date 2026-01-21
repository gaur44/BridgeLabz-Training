package checkout;

import java.util.*;

class CheckoutCounter {

    Queue<Customer> queue = new LinkedList<>();
    Map<String, Integer> priceMap = new HashMap<>();
    Map<String, Integer> stockMap = new HashMap<>();

    CheckoutCounter() {
        priceMap.put("Milk", 50);
        priceMap.put("Bread", 30);
        priceMap.put("Eggs", 10);

        stockMap.put("Milk", 10);
        stockMap.put("Bread", 5);
        stockMap.put("Eggs", 20);
    }

    void addCustomer(Customer c) {
        queue.add(c);
        System.out.println(c.name + " joined the queue");
    }

    void processCustomer() {
        if (queue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }

        Customer c = queue.poll();
        int bill = 0;

        for (String item : c.items) {
            if (stockMap.get(item) > 0) {
                bill += priceMap.get(item);
                stockMap.put(item, stockMap.get(item) - 1);
            }
        }

        System.out.println(c.name + "'s bill = Rs." + bill);
    }
}

