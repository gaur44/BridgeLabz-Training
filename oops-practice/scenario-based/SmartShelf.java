class Book {
    String title;
    
    public Book(String title) {
        this.title = title;
    }
}

class SmartShelf {
    private Book[] shelf;
    private int count;
    
    public SmartShelf(int capacity) {
        shelf = new Book[capacity];
        count = 0;
    }
    
    // insertion sort - adds book and keeps sorted
    public void addBook(String title) {
        Book book = new Book(title);
        shelf[count] = book;
        
        int i = count;
        while(i > 0 && shelf[i].title.compareTo(shelf[i-1].title) < 0) {
            Book temp = shelf[i];
            shelf[i] = shelf[i-1];
            shelf[i-1] = temp;
            i--;
        }
        count++;
        System.out.println("Added: " + title);
    }
    
    public void displayShelf() {
        System.out.println("\nBooks on shelf:");
        for(int i = 0; i < count; i++) {
            System.out.println((i+1) + ". " + shelf[i].title);
        }
    }
    
    public static void main(String[] args) {
        SmartShelf shelf = new SmartShelf(10);
        
        shelf.addBook("Java Programming");
        shelf.addBook("Data Structures");
        shelf.addBook("Algorithms");
        shelf.addBook("Computer Networks");
        
        shelf.displayShelf();
        
        shelf.addBook("Database Systems");
        shelf.displayShelf();
    }
}