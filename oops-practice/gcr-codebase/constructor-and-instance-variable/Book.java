public class Book {
    // Attributes
    String title;
    String author;
    double price;
    
    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
    
    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Harry Potter", "J. K. Rowling", 50);
    }
}
