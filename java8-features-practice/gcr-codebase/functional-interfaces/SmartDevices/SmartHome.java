public class SmartHome {
    public static void main(String[] args) {
        AC ac = new AC();
        TV tv = new TV();
        Light light = new Light();

        ac.turnOn();
        light.turnOn();
        tv.turnOn();

        ac.turnOff();
        tv.turnOff();
        light.turnOff();
    }
}
