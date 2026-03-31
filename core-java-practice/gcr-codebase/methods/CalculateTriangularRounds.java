import java.util.Scanner;

public class CalculateTriangularRounds {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        int distance = 5 * 1000; // 5 kilometers -> meters
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter side A (in meters): ");
        double a = scanner.nextDouble();
        System.out.print("enter side B (in meters): ");
        double b = scanner.nextDouble();
        System.out.print("enter side C (in meters): ");
        double c = scanner.nextDouble();
        double rounds = calculateRounds(a, b, c);
        System.out.printf("the athlete must complete %.2f rounds to cover 5 km.%n", rounds);
        scanner.close();
    }
}