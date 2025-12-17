import java.util.Scanner;

public class KilometerToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input distance (in KMs): ");
        int dist = sc.nextInt();
        double miles = dist * 0.621371;

        System.out.print("miles: " + miles);
    }
}
