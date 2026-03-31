package marketplace;

public class CatalogUtils {

    // Apply discount to any Product type
    public static <T> void applyDiscount(Product<T> product, double percentage) {
        double newPrice = product.getPrice() * (1 - percentage / 100);
        product.setPrice(newPrice);
    }

    public static <T> void displayProduct(Product<T> product) {
        System.out.println(product);
    }
}

