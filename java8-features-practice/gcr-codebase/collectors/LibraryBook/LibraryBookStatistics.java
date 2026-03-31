import java.util.*;
import java.util.stream.Collectors;

public class LibraryBookStatistics {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Book1", "Fiction", 300));
        books.add(new Book("Book2", "Fiction", 250));
        books.add(new Book("Book3", "Science", 400));
        books.add(new Book("Book4", "Science", 350));
        books.add(new Book("Book5", "History", 200));

        Map<String, IntSummaryStatistics> statsByGenre =
                books.stream()
                     .collect(Collectors.groupingBy(
                             Book::getGenre,
                             Collectors.summarizingInt(Book::getPages)
                     ));

        for (String genre : statsByGenre.keySet()) {
            IntSummaryStatistics stats = statsByGenre.get(genre);

            System.out.println("Genre: " + genre);
            System.out.println("Total Pages: " + stats.getSum());
            System.out.println("Average Pages: " + stats.getAverage());
            System.out.println("Max Pages: " + stats.getMax());
            System.out.println();
        }
    }
}

