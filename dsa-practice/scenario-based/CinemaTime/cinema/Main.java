package cinema;

public class Main {
    public static void main(String[] args) {

        MovieManager cm = new MovieManager();

        try {
            cm.addMovie("Inception", "18:30");
            cm.addMovie("Interstellar", "21:00");
            // cm.addMovie("BadTime", "25:99"); // throws exception
        } catch (InvalidTimeFormatException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("All Movies:");
        cm.displayAllMovies();

        System.out.println("\nSearch result:");
        cm.searchMovie("Inter");

        System.out.println("\nPrintable report:");
        cm.printReport();
    }
}

