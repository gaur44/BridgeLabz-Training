import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("length: ");
        int length = sc.nextInt();
        System.out.print("width: ");
        int width = sc.nextInt();
        System.out.print("perimeter: ");
        int perimeter = 2 * length * width;
        System.out.print(perimeter);
    }
}
