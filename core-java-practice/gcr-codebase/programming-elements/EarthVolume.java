import java.util.Scanner;
public class EarthVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double volume = (4/3) * 3.14 * Math.pow(6378,3);
        double mile = 6378 * 0.621371;
        double mileVolume = (4/3) * 3.14 * Math.pow(mile,3);
        System.out.print("The volume of earth in cubic kilometers is " + volume + " and cubic miles is " + mileVolume);
     }
}