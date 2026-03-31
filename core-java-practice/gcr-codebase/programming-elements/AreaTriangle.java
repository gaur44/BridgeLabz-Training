import java.util.Scanner;
public class AreaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("base: ");
        int base = sc.nextInt();
        System.out.print("height: ");
        int height = sc.nextInt();
        double area = (0.5) * base * height;
        double areaInch= area / (2.54 * 2.54);
        System.out.println("The Area of the triangle in sq in is " + areaInch + " and sq cm is "+ area);
    }
}
