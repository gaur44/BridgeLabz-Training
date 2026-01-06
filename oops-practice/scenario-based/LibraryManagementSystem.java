class BookNotAvailableException extends Exception {
    BookNotAvailableException(String message) { super(message); }
}

class Book {
    String title, author;
    boolean status;   // true = free

    Book(String title, String author, boolean status) {
        this.title = title;
        this.author = author;
        this.status = status;
    }
}

public class LibraryManagementSystem {

    static void show(Book[] b) {
        for (int i = 0; i < b.length; i++)
            System.out.println(b[i].title + " | " + (b[i].status ? "Free" : "Out"));
    }

    static void search(Book[] b, String k) {
        for (int i = 0; i < b.length; i++)
            if (b[i].title.toLowerCase().contains(k.toLowerCase()))
                System.out.println("Found: " + b[i].title);
    }

    static void take(Book[] b, String t) throws BookNotAvailableException {
        for (int i = 0; i < b.length; i++) {
            if (b[i].title.equalsIgnoreCase(t)) {
                if (!b[i].status)
                    throw new BookNotAvailableException("Not available");
                b[i].status = false;
                System.out.println("Taken: " + b[i].title);
                return;
            }
        }
        System.out.println("No book");
    }

    public static void main(String[] args) {

        Book[] arr = {
            new Book("Java", "Rahul", true),
            new Book("Python", "Rohan", false),
            new Book("DSA", "Ram", true)
        };

        show(arr);

        search(arr, "ja");

        try {
            take(arr, "Python");   // already out
            take(arr, "Java");
        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }

        show(arr);
    }
}
