public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 100.0;
    
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    
    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
        System.out.println();
    }
    
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rohan", "Car");
        Vehicle v2 = new Vehicle("Shyam", "Motorcycle");
        
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        
        Vehicle.updateRegistrationFee(150.0);
        System.out.println("After updating registration fee:");
        
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}