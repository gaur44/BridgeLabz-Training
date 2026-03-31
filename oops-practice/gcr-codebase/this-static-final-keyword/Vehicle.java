public class Vehicle {

    // static variable
    private static double registrationFee = 150.0;

    private String ownerName;
    private String vehicleType;

    // final variable to uniquely identify each vehicle
    private final String registrationNumber;

    // Constructor using 'this'
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // static method - update registration fees
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // method - display vehicle details
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Reg. Number: " + registrationNumber);
            System.out.println("Reg. Fee: " + registrationFee);
        } else {
            System.out.println("Invalid vehicle instance.");
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rohan", "Sedan", "ABC123");
        Vehicle v2 = new Vehicle("Harsh", "SUV", "XYZ789");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
