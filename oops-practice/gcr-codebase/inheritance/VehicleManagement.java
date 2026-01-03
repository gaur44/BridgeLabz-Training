public class VehicleManagement {
    public static void main(String[] args) {

        Vehicle vehicle1 = new ElectricVehicle(160, "Tesla Model S");
        Vehicle vehicle2 = new PetrolVehicle(180, "Maruti Suzuki");

        ((ElectricVehicle) vehicle1).charge();
        ((PetrolVehicle) vehicle2).refuel();
    }
}

class Vehicle {
    int maxSpeed;
    String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {

    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println("Electric vehicle is charging");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {

    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println("Petrol vehicle is being refueled");
    }
}
