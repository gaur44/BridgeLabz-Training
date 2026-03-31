public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "1998");
        Author author1 = new Author("Harry Potter", "1998", "J. K. Rowling",
                "Joanne Rowling, known by her pen name J. K. Rowling, is a British author and philanthropist. She is the author of Harry Potter.");

        book1.displayInfo();
        author1.displayInfo();
    }

}

class Book {
    String title;
    String publicationYear;

    public Book(String title, String publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }

}

class Author extends Book {
    String name;
    String bio;

    public Author(String title, String publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Name: " + name);
        System.out.println("Bio: " + bio);
    }
}
