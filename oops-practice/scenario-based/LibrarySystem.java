public class LibrarySystem {
    public static void main(String[] args) {

        Book[] books = new Book[3];

        books[0] = new Book("Harry Potter", "J K Rowling");
        books[1] = new Book("The Hobbit", "J R Tolkien");
        books[2] = new Book("Meditations", "Marcus Aurelius");

        displayBooks(books);

        System.out.println("Searching for 'Harry':");
        searchBookByTitle(books, "Harry");

        System.out.println("\nChecking out Harry Potter:");
        checkoutBook(books, "Harry Potter");

        System.out.println("\nAfter checkout:");
        displayBooks(books);
    }

    static void displayBooks(Book[] books) {
        for (Book b : books) {
            System.out.println(b.titleBook + ", " + b.author + ", " + b.availabilityStatus);
        }
    }

    static void searchBookByTitle(Book[] books, String keyword) {
        for (Book b : books) {
            if (b.titleBook.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(b.titleBook + " by " + b.author + " (" + b.availabilityStatus + ")");
            }
        }
    }

    static void checkoutBook(Book[] books, String title) {
        for (Book b : books) {
            if (b.titleBook.equalsIgnoreCase(title)) {
                if (b.availabilityStatus.equals("Available")) {
                    b.availabilityStatus = "Checked Out";
                    System.out.println("Book checked out successfully");
                } else {
                    System.out.println("Book already checked out");
                }
                return;
            }
        }
        System.out.println("Book not found");
    }
}

class Book {
    String titleBook;
    String author;
    String availabilityStatus;

    Book(String title, String author) {
        this.titleBook = title;
        this.author = author;
        this.availabilityStatus = "Available";
    }
}
