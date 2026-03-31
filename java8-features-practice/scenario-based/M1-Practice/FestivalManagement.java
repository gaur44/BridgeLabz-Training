import java.util.*;

abstract class Festival {
    String name;
    String location;
    String date;

    Festival(String name, String location, String date) {
        this.name = name;
        this.location = location;
        this.date = date;
    }

    abstract void display();
}

class MusicFestival extends Festival {
    String headliner;
    String genre;
    int price;

    MusicFestival(String name, String location, String date,
                  String headliner, String genre, int price) {
        super(name, location, date);
        this.headliner = headliner;
        this.genre = genre;
        this.price = price;
    }

    void display() {
        System.out.println("Festival Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Headliner: " + headliner);
        System.out.println("Music Genre: " + genre);
        System.out.println("Ticket Price: " + price);
    }
}

class FoodFestival extends Festival {
    String cuisine;
    int stalls;
    int fee;

    FoodFestival(String name, String location, String date,
                 String cuisine, int stalls, int fee) {
        super(name, location, date);
        this.cuisine = cuisine;
        this.stalls = stalls;
        this.fee = fee;
    }

    void display() {
        System.out.println("Festival Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Cuisine: " + cuisine);
        System.out.println("Number of Stalls: " + stalls);
        System.out.println("Entry Fee: " + fee);
    }
}

class ArtFestival extends Festival {
    String artType;
    int artists;
    int fee;

    ArtFestival(String name, String location, String date,
                String artType, int artists, int fee) {
        super(name, location, date);
        this.artType = artType;
        this.artists = artists;
        this.fee = fee;
    }

    void display() {
        System.out.println("Festival Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Art Type: " + artType);
        System.out.println("Number of Artists: " + artists);
        System.out.println("Exhibition Fee: " + fee);
    }
}

public class FestivalManagement {

    static Map<String, Festival> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");

            if (parts[0].equals("EXIT")) {
                break;
            }

            if (parts[0].equals("ADD_FESTIVAL")) {
                addFestival(parts);
            } else if (parts[0].equals("DISPLAY_DETAILS")) {
                display(parts[1]);
            }
        }

        sc.close();
    }

    private static void addFestival(String[] p) {
        String type = p[1];

        if (type.equals("MUSIC")) {
            Festival f = new MusicFestival(
                    p[2], p[3], p[4],
                    p[5], p[6], Integer.parseInt(p[7])
            );
            map.put(p[2], f);
        } else if (type.equals("FOOD")) {
            Festival f = new FoodFestival(
                    p[2], p[3], p[4],
                    p[5], Integer.parseInt(p[6]), Integer.parseInt(p[7])
            );
            map.put(p[2], f);
        } else if (type.equals("ART")) {
            Festival f = new ArtFestival(
                    p[2], p[3], p[4],
                    p[5], Integer.parseInt(p[6]), Integer.parseInt(p[7])
            );
            map.put(p[2], f);
        }
    }

    private static void display(String name) {
        if (map.containsKey(name)) {
            map.get(name).display();
        }
    }
}
