import java.util.*;

class NoDriverAvailableException extends Exception {
    public NoDriverAvailableException(String msg) {
        super(msg);
    }
}

interface FareCalculator {
    double calculateFare(double distance);
}

class NormalFare implements FareCalculator {
    public double calculateFare(double dist) {
        return dist * 10;
    }
}

// Peak pricing
class PeakFare implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 15;
    }
}

class User {
    int id;
    String name;
    // stores ride history
    List<Ride> rides = new ArrayList<>();
    
    User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Driver {
    int id;
    String name;
    // tracks driver availability
    boolean available = true;
    
    Driver(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Ride {
    // auto-increment ride ID
    static int counter = 1;
    int rideId;
    User user;
    Driver driver;
    double distance, fare;
    
    Ride(User user, Driver driver, double distance, double fare) {
        this.rideId = counter++;
        this.user = user;
        this.driver = driver;
        this.distance = distance;
        this.fare = fare;
        user.rides.add(this);
    }
}

class RideManager {
    List<Driver> drivers = new ArrayList<>();
    
    // CREATE
    void addDriver(Driver d) { drivers.add(d); }
    
    // READ
    Driver assignDriver() throws NoDriverAvailableException {
        for (Driver d : drivers) {
            if (d.available) {
                d.available = false;
                return d;
            }
        }
        throw new NoDriverAvailableException("No driver available");
    }
    
    // CREATE
    Ride bookRide(User user, double distance, FareCalculator calc) throws NoDriverAvailableException {
        Driver driver = assignDriver();
        double fare = calc.calculateFare(distance);
        return new Ride(user, driver, distance, fare);
    }
}

public class CabBookingSystem {
    public static void main(String[] args) {
        RideManager manager = new RideManager();
        manager.addDriver(new Driver(1, "Rohan"));
        manager.addDriver(new Driver(2, "Rahul"));
        
        User user = new User(101, "Amit");
        
        try {
            Ride ride = manager.bookRide(user, 12, new PeakFare());
            System.out.println("Ride Booked - Driver: " + ride.driver.name + ", Fare: " + ride.fare);
        } catch (NoDriverAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}