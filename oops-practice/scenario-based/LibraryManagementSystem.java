class BookNotAvailableException extends Exception {
    BookNotAvailableException(String m) { super(m); }
}

class Book {
    String t, a;
    boolean ok;   // true = free

    Book(String t, String a, boolean ok) {
        this.t = t;
        this.a = a;
        this.ok = ok;
    }
}

public class LibraryManagementSystem {

    static void show(Book[] b) {
        for (int i = 0; i < b.length; i++)
            System.out.println(b[i].t + " | " + (b[i].ok ? "Free" : "Out"));
    }

    static void search(Book[] b, String k) {
        for (int i = 0; i < b.length; i++)
            if (b[i].t.toLowerCase().contains(k.toLowerCase()))
                System.out.println("Found: " + b[i].t);
    }

    static void take(Book[] b, String t) throws BookNotAvailableException {
        for (int i = 0; i < b.length; i++) {
            if (b[i].t.equalsIgnoreCase(t)) {
                if (!b[i].ok)
                    throw new BookNotAvailableException("Not available");
                b[i].ok = false;
                System.out.println("Taken: " + b[i].t);
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
