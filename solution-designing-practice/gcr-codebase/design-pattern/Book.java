package library;

public class Book {
    private final String title;
    private final String author;
    private final String edition;
    private final String genre;

    private Book(BookBuilder b) {
        this.title = b.title;
        this.author = b.author;
        this.edition = b.edition;
        this.genre = b.genre;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getEdition() { return edition; }
    public String getGenre() { return genre; }

    public static class BookBuilder {
        private final String title;
        private String author;
        private String edition;
        private String genre;

        public BookBuilder(String title) {
            this.title = title;
        }

        public BookBuilder author(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder edition(String edition) {
            this.edition = edition;
            return this;
        }

        public BookBuilder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
