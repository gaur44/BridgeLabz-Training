import java.util.Scanner;
public class DistInYardAndMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feet;
        feet = sc.nextInt();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.println("Distance " + feet + " feet is " + yards + " yards and " + miles + " miles");
    }
}
