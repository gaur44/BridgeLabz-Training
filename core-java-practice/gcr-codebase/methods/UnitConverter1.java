public class UnitConverter1 {

    public static double yard2feet(double yards) {
        return yards * 3;
    }

    public static double feet2yard(double feet) {
        return feet * 0.333333;
    }

    public static double meters2inches(double meters) {
        return meters * 39.3701;
    }

    public static double inches2meters(double inches) {
        return inches * 0.0254;
    }

    public static double inch2centimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        System.out.println("10 yards to feet: " + yard2feet(10));
        System.out.println("30 feet to yards: " + feet2yard(30));
        System.out.println("1 meter to inches: " + meters2inches(1));
        System.out.println("12 inches to meters: " + inches2meters(12));
        System.out.println("12 inches to cm: " + inch2centimeters(12));
    }
}