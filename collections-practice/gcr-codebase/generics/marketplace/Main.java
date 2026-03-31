package marketplace;

public class Main {
    public static void main(String[] args) {
        // Just pass the category object once
        Product<Book> book1 = new Product<>("The Great Gatsby", 20.0, new Book("Fiction"));
        Product<Clothing> shirt = new Product<>("Cool Shirt", 50.0, new Clothing("Shirt"));
        Product<Gadget> phone = new Product<>("Galaxy S23", 300.0, new Gadget("Samsung"));

        System.out.println("Before discount:");
        CatalogUtils.displayProduct(book1);
        CatalogUtils.displayProduct(shirt);
        CatalogUtils.displayProduct(phone);

        // Apply 10% discount
        CatalogUtils.applyDiscount(book1, 10);
        CatalogUtils.applyDiscount(shirt, 10);
        CatalogUtils.applyDiscount(phone, 10);

        System.out.println("\nAfter 10% discount:");
        CatalogUtils.displayProduct(book1);
        CatalogUtils.displayProduct(shirt);
        CatalogUtils.displayProduct(phone);
    }
}
