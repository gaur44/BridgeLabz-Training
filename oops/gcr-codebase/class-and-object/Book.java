public class Book {
    private String title;
    private String author;
    private double price;
    
    // constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    // display book details
    public void displayDetails() {
        System.out.println("Title of the book: " + title);
        System.out.println("Author of the book: " + author);
        System.out.println("Price of the book: " + price);
        System.out.println();
    }
    public static void main(String[] args) {
        // Create Objects
        Book book1 = new Book("2States", "Chetan Bhagat", 500.0);
        Book book2 = new Book("Wings Of Fire", "Abdul kalam.A.P.J", 500.0);
        
        // Display details
        book1.displayDetails();
        book2.displayDetails();
    }
}
