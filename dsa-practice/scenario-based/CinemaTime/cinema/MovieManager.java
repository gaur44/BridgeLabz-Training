package cinema;

import java.util.*;

class MovieManager {

    private List<String> titles = new ArrayList<>();
    private List<String> times = new ArrayList<>();

    void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!time.matches("\\d{2}:\\d{2}"))
            throw new InvalidTimeFormatException("Invalid time format");

        int h = Integer.parseInt(time.substring(0, 2));
        int m = Integer.parseInt(time.substring(3));

        if (h > 23 || m > 59)
            throw new InvalidTimeFormatException("Invalid time value");

        titles.add(title);
        times.add(time);
    }

    void searchMovie(String keyword) {
        try {
            for (int i = 0; i < titles.size(); i++) {
                if (titles.get(i).contains(keyword)) {
                    System.out.println(
                        String.format("%s at %s", titles.get(i), times.get(i))
                    );
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Search error");
        }
    }

    void displayAllMovies() {
        for (int i = 0; i < titles.size(); i++) {
            System.out.println(titles.get(i) + " at " + times.get(i));
        }
    }

    void printReport() {
        String[] movieArray = titles.toArray(new String[0]);
        for (String m : movieArray)
            System.out.println(m);
    }
}

