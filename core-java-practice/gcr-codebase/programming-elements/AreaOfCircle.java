import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.print("Enter radius: ");
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextDouble();

        double area = 3.14 * Math.pow(rad, 2);
        System.out.println(area);
    }
}
