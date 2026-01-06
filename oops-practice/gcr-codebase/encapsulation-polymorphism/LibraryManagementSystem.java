public class LibraryManagementSystem {
    public static void main(String[] args) {

        LibraryItem[] items = new LibraryItem[3];

        items[0] = new Book("B101", "Harry Potter", "J. K. Rowling");
        items[1] = new Magazine("B102", "To Kill a Mockingbird", "Harper Leet");
        items[2] = new DVD("D101", "Inception", "Christopher Nolan");

        for (LibraryItem item : items) {

            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                r.reserveItem();
                System.out.println("Available: " + r.checkAvailability());
            }

            System.out.println();
        }
    }
}

abstract class LibraryItem {

    // encapsulation
    private String itemId;
    private String title;
    private String author;

    private String borrowerName;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.borrowerName = null;
    }

    // abstract method
    public abstract int getLoanDuration();

    // concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    protected void setBorrowerName(String name) {
        this.borrowerName = name;
    }

    protected String getBorrowerName() {
        return borrowerName;
    }
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {

    private boolean available = true;

    public Book(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            setBorrowerName("Reserved User");
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

class Magazine extends LibraryItem implements Reservable {

    private boolean available = true;

    public Magazine(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week
    }

    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            setBorrowerName("Reserved User");
            System.out.println("Magazine reserved successfully.");
        } else {
            System.out.println("Magazine already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

class DVD extends LibraryItem implements Reservable {

    private boolean available = true;

    public DVD(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            setBorrowerName("Reserved User");
            System.out.println("DVD reserved successfully.");
        } else {
            System.out.println("DVD already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}
