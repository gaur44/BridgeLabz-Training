public class Vehicle {
    private String number;
    private double unitsNeeded;

    public Vehicle(String number, double unitsNeeded) {
        this.number = number;
        this.unitsNeeded = unitsNeeded;
    }

    public double getUnitsNeeded() {
        return unitsNeeded;
    }

    public String getNumber() {
        return number;
    }
}
