import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Convert Temperature");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose option: ");

        int choice = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        if (choice == 1) {
            double result = fToC(temp);
            System.out.println(temp + "°F = " + result + "°C");
        } else if (choice == 2) {
            double result = cToF(temp);
            System.out.println(temp + "°C = " + result + "°F");
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }

    // method to convert from Fahrenheit to Celsius
    static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    // method to convert from Celsius to Fahrenheit
    static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }
}