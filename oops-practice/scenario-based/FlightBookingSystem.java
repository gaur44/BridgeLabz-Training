import java.util.*;

// flight class
class Flight {
    protected int id;
    protected String source;
    protected String destination;

    public Flight(int id, String source, String destination) {
        this.id = id;
        this.source = source;
        this.destination = destination;
    }

    public void displayInfo() {
        System.out.println("Flight " + id + ": " + source + " -> " + destination);
    }
}


// booking class
class Booking {
    protected int bookingId;
    protected Flight flight;
    protected String passengerName;

    public Booking(int id, Flight flight, String name) {
        this.bookingId = id;
        this.flight = flight;
        this.passengerName = name;
    }

    public void displayBooking() {
        System.out.println("Booking " + bookingId + " | " + passengerName +
                " | Flight " + flight.id);
    }
}

public class FlightBookingSystem {
    static Flight[] flights = {
            new Flight(1, "Delhi", "Mumbai"),
            new Flight(2, "Chennai", "Bangalore"),
            new Flight(3, "Delhi", "Pune")
    };

    static List<Booking> bookings = new ArrayList<>();
    static int bookingCounter = 1;

    public static void main(String[] args) {

        Flight f = searchFlight("delhi", "mumbai");
        if (f != null)
            bookFlight(f, "Rahul");

        displayBookings();
    }

    static Flight searchFlight(String src, String dest) {
        for (Flight f : flights) {
            if (f.source.equalsIgnoreCase(src) &&
                    f.destination.equalsIgnoreCase(dest))
                return f;
        }
        return null;
    }

    static void bookFlight(Flight flight, String name) {
        bookings.add(new Booking(bookingCounter++, flight, name));
    }

    static void displayBookings() {
        for (Booking b : bookings)
            b.displayBooking();
    }
}
