import java.util.*;
import java.util.stream.Collectors;

public class OrderRevenueSummary {

    public static void main(String[] args) {

        List<Order> orders = new ArrayList<>();
        orders.add(new Order("Agraj", 250.50));
        orders.add(new Order("Amit", 300.00));
        orders.add(new Order("Rohan", 150.00));
        orders.add(new Order("Harsh", 200.00));
        orders.add(new Order("Mukul", 100.00));

        Map<String, Double> revenueByCustomer =
                orders.stream()
                      .collect(Collectors.groupingBy(
                              Order::getCustomerName,
                              Collectors.summingDouble(Order::getAmount)
                      ));

        System.out.println(revenueByCustomer);
    }
}

