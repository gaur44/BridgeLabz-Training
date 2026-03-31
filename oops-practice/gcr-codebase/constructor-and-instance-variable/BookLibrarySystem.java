class Book {
    public String ISBN;
    protected String title;
    private String author;
    
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {
    String fileSize;
    
    public EBook(String ISBN, String title, String author, String fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }
    
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
        System.out.println("File Size: " + fileSize);
    }
}

class BookLibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book("978-0134685991", "Harry Potter", "K. J. Rowling");
        System.out.println("Author: " + b1.getAuthor());
        
        b1.setAuthor("J. K. Rowling");
        System.out.println("Updated Author: " + b1.getAuthor());
        System.out.println();
        
        EBook eb1 = new EBook("978-0135166307", "Harry Potter E-book", "J. K. Rowling", "5MB");
        eb1.displayDetails();
    }
}