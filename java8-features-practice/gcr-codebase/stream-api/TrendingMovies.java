import java.util.*;

class Movie {
    String name;
    int year;
    double rating;

    Movie(String name, int year, double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }
}

public class TrendingMovies {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
            new Movie("A", 2022, 8.5),
            new Movie("B", 2023, 9.0),
            new Movie("C", 2021, 7.8),
            new Movie("D", 2023, 8.9),
            new Movie("E", 2020, 9.2),
            new Movie("F", 2023, 8.7)
        );

        movies.stream()
              .filter(m -> m.year >= 2022)
              .sorted(Comparator.comparingDouble((Movie m) -> m.rating).reversed())
              .limit(5)
              .forEach(m -> System.out.println(m.name));
    }
}
