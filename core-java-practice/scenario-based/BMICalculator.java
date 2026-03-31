import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("height (in cm): ");
        double height = scanner.nextDouble();

        System.out.print("weight (in kg): ");
        double weight = scanner.nextDouble();

        double heightM = height / 100;

        double bmi = weight / (Math.pow(heightM, 2));
        
        if (bmi <= 18.4) {
            System.out.println("Category: Underweight");
        }
        else if (bmi < 25) {
            System.out.println("Category: Normal");
        }
        else if (bmi < 40) {
            System.out.println("Category: Overweight");
        }
        else {
            System.out.println("Category: Obese");
        }
    }
}
