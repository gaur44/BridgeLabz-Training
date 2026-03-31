import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.print("Enter temperature in Celsius: ");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        
        double fahrenheit = (n * 9/5) + 32;
        System.out.println(fahrenheit);
    }
}
