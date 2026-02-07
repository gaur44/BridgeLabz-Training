public class SmartVehicleApp {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle ev = new ElectricCar();

        car.displaySpeed();
        car.displayBattery();

        ev.displaySpeed();
        ev.displayBattery();
    }
}
