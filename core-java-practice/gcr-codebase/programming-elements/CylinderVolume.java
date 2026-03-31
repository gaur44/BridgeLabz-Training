import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("radius: ");
        int radius = sc.nextInt();
        System.out.print("height: ");
        int height = sc.nextInt();
        double volume = 3.14 * radius * radius * height;
        System.out.print("volume: "+ volume);
    }
}
