import java.util.ArrayList;
import java.util.List;

public class RideHailingApp {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("C101", "Ravi", 15));
        vehicles.add(new Bike("B101", "Amit", 8));
        vehicles.add(new Auto("A101", "Suresh", 10));

        double distance = 12.5; // km

        calculateFares(vehicles, distance);
    }

    // polymorphism
    public static void calculateFares(List<Vehicle> vehicles, double distance) {

        for (Vehicle v : vehicles) {

            v.getVehicleDetails();

            double fare = v.calculateFare(distance);
            System.out.println("Distance: " + distance + " km");
            System.out.println("Total Fare: ₹" + fare);

            if (v instanceof GPS) {
                GPS g = (GPS) v;
                System.out.println("Current Location: " + g.getCurrentLocation());
                g.updateLocation("On the way");
            }

            System.out.println();
        }
    }
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: ₹" + ratePerKm);
    }

    protected double getRatePerKm() {
        return ratePerKm;
    }
}

interface GPS {
    String getCurrentLocation();

    void updateLocation(String newLocation);
}

class Car extends Vehicle implements GPS {

    private String location = "Garage";

    public Car(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

class Bike extends Vehicle implements GPS {

    private String location = "Parking Area";

    public Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return (getRatePerKm() * distance) - 10; // cheaper rides
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

class Auto extends Vehicle implements GPS {

    private String location = "Auto Stand";

    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return (getRatePerKm() * distance) + 20; // base charge
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}
