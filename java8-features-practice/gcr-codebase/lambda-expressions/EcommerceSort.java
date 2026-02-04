import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + "  INR" + price + "  Rating:" + rating + "  Discount:" + discount + "%";
    }
}

public class EcommerceSort {
    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
            new Product("Phone", 20000, 4.5, 10),
            new Product("Laptop", 70000, 4.7, 15),
            new Product("Headphones", 6000, 4.2, 25)
        );

        // sort by price
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("Sorted by Price:");
        products.forEach(System.out::println);

        // sort by rating
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nSorted by Rating:");
        products.forEach(System.out::println);

        // sort by discount
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("\nSorted by Discount:");
        products.forEach(System.out::println);
    }
}

