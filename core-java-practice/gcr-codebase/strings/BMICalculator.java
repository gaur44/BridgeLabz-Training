import java.util.Scanner;

public class BMICalculator {
    
    public static String[] calculateBMI(double weight, double height) {
        String[] result = new String[2];        
        double h = height / 100;
        double bmi = weight / (h * h);
        
        result[0] = String.format("%.2f", bmi);
        
        if (bmi <= 18.4) {
            result[1] = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            result[1] = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            result[1] = "Overweight";
        } else {
            result[1] = "Obese";
        }
        
        return result;
    }
    
    public static String[][] findAllBMI(double[][] data) {
        String[][] result = new String[data.length][4];
        
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            
            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            
            String[] bmiData = calculateBMI(weight, height);
            result[i][2] = bmiData[0];
            result[i][3] = bmiData[1];
        }
        
        return result;
    }
    
    public static void displayTable(String[][] data) {
        System.out.println("\nHeight(cm)\tWeight\tBMI\t\tStatus");        
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1] + "\t\t" + 
                             data[i][2] + "\t\t" + data[i][3]);
        }
    }
    
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[][] data = new double[10][2];
        
        System.out.println("Enter weight and height for 10 persons:");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " weight (kg): ");
            data[i][0] = sc.nextDouble();
            
            System.out.print("Person " + (i + 1) + " height (cm): ");
            data[i][1] = sc.nextDouble();
        }
        
        String[][] result = findAllBMI(data);
        
        displayTable(result);
        
        sc.close();
    }
}