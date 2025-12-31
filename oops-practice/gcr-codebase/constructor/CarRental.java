public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    
    public CarRental() {
        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
    }
    
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    
    public double calculateTotalCost() {
        return rentalDays * 50.0;
    }
    
    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        System.out.println("Total Cost: " + rental1.calculateTotalCost());
        
        CarRental rental2 = new CarRental("Rohan", "Toyota", 5);
        System.out.println("Total Cost: " + rental2.calculateTotalCost());
    }
}