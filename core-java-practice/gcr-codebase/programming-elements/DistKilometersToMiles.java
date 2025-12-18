import java.util.Scanner;

public class DistKilometersToMiles {
    public static void main(String[] args) {
        double km;
        Scanner sc = new Scanner(System.in);
        km = sc.nextInt();
        double mile = km / 1.6;
        System.out.println("The total miles is " + mile + " for the given " + km + " km");
    }
}
