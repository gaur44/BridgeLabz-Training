public class Product {
    // instance variables
    String productName;
    double price;

    // class variable
    static int totalProducts = 0;
    
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    
    // method to display product details
    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: $" + price);
    }
    
    // method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
    
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 999.99);
        Product p2 = new Product("Mouse", 25.50);
        Product p3 = new Product("Keyboard", 75.00);
        
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();
        
        Product.displayTotalProducts();
    }
}