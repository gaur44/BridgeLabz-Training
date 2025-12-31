public class LibraryBook {
    // Attributes
    String title;
    String author;
    double price;
    boolean availability;
    
    // Constructor
    public LibraryBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }
    
    // method to borrow a book
    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is currently not available.");
        }
    }
    
    // display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Available: " + (availability ? "Yes" : "No"));
        System.out.println();
    }
    
    public static void main(String[] args) {
        // create books
        LibraryBook book1 = new LibraryBook("1984", "George Orwell", 15.99, true);
        LibraryBook book2 = new LibraryBook("Harry Potter", "J. K. Rowling", 12.50, true);
                
        // display initial status
        System.out.println("Initial Book Status:");
        book1.displayDetails();
        book2.displayDetails();
        
        // borrow books
        book1.borrowBook();
        book2.borrowBook();
        System.out.println();
    }
}