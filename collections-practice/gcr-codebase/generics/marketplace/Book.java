package marketplace;

public class Book {
    private String genre;

    public Book(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book: " + genre;
    }
}

