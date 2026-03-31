interface IRentable {
    double calculateRent(int days);
}

abstract class Vehicle {
    protected int id;
    protected String brand;

    public Vehicle(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    public abstract void displayInfo();
}

class Bike extends Vehicle implements IRentable {
    protected double ratePerDay;

    public Bike(int id, String brand, double ratePerDay) {
        super(id, brand);
        this.ratePerDay = ratePerDay;
    }

    public double calculateRent(int days) {
        return days * ratePerDay;
    }

    public void displayInfo() {
        System.out.println("Bike: " + brand);
    }
}

class Car extends Vehicle implements IRentable {
    protected double ratePerDay;

    public Car(int id, String brand, double ratePerDay) {
        super(id, brand);
        this.ratePerDay = ratePerDay;
    }

    public double calculateRent(int days) {
        return days * ratePerDay;
    }

    public void displayInfo() {
        System.out.println("Car: " + brand);
    }
}

class Truck extends Vehicle implements IRentable {
    protected double ratePerDay;

    public Truck(int id, String brand, double ratePerDay) {
        super(id, brand);
        this.ratePerDay = ratePerDay;
    }

    public double calculateRent(int days) {
        return days * ratePerDay;
    }

    public void displayInfo() {
        System.out.println("Truck: " + brand);
    }
}

class Customer {
    protected int customerId;
    protected String name;

    public Customer(int id, String name) {
        this.customerId = id;
        this.name = name;
    }
}

public class VehicleRentalApp {
    public static void main(String[] args) {

        Customer c1 = new Customer(1, "Rahul");

        // CREATE
        Vehicle v1 = new Bike(1, "Yamaha", 300);
        Vehicle v2 = new Car(2, "Honda", 800);
        Vehicle v3 = new Truck(3, "Tata", 1200);

        // READ (polymorphism)
        v1.displayInfo();
        System.out.println(v1 instanceof IRentable ? ((IRentable)v1).calculateRent(2) : 0);

        v2.displayInfo();
        System.out.println(((IRentable)v2).calculateRent(2));

        v3.displayInfo();
        System.out.println(((IRentable)v3).calculateRent(2));

        // UPDATE
        v2 = new Car(2, "Hyundai", 900);

        // DELETE
        v1 = null;
    }
}
