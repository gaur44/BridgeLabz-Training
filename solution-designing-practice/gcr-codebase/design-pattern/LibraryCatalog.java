package library;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    private static LibraryCatalog instance;
    private final List<Book> books = new ArrayList<>();
    private final List<Observer> observers = new ArrayList<>();

    private LibraryCatalog() {}

    public static synchronized LibraryCatalog getInstance() {
        if (instance == null)
            instance = new LibraryCatalog();
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
        newBookArrived(book.getTitle());
    }

    public void newBookArrived(String bookTitle) {
        notifyObservers("New book available: " + bookTitle);
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    private void notifyObservers(String msg) {
        for (Observer o : observers)
            o.update(msg);
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }
}
