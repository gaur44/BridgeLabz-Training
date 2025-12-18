import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("base(in cm): ");
        int base = sc.nextInt();
        System.out.print("height(in cm): ");
        int height = sc.nextInt();
        double triangleArea = (0.5) * base * height;
        double areaInch = triangleArea / (2.54 * 2.54);
        System.out.println("The Area of the triangle in sq in is "+areaInch+" and sq cm is "+triangleArea);
    }
}
