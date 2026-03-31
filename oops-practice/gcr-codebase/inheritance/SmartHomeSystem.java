public class SmartHomeSystem {
    public static void main(String[] args) {

        Device device1 = new Device("D001", "ON");
        Thermostat thermostat1 = new Thermostat("T001", "ON", 22.5);

        device1.displayStatus();
        System.out.println();

        thermostat1.displayStatus();
    }
}

class Device {
    String deviceId;
    String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}


class Thermostat extends Device {
    double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
