import java.util.Scanner;

public class LineComparisonProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Line Comparison Program");
        
        // Take input from user
        // line 1
        System.out.println();
        System.out.println("Enter Line 1 coordinates:");
        System.out.print("x1: ");
        double x1_line1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1_line1 = scanner.nextDouble();
        System.out.print("x2: ");
        double x2_line1 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2_line1 = scanner.nextDouble();
        
        // line 2
        System.out.println("\nEnter Line 2 coordinates:");
        System.out.print("x1: ");
        double x1_line2 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1_line2 = scanner.nextDouble();
        System.out.print("x2: ");
        double x2_line2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2_line2 = scanner.nextDouble();
        
        // UC 1 - calculate lengths of lines
        double length1 = Math.sqrt(Math.pow(x2_line1 - x1_line1, 2) + Math.pow(y2_line1 - y1_line1, 2));
        double length2 = Math.sqrt(Math.pow(x2_line2 - x1_line2, 2) + Math.pow(y2_line2 - y1_line2, 2));
        
        System.out.println("\nResults:");
        System.out.printf("Line 1 Length: %.2f\n", length1);
        System.out.printf("Line 2 Length: %.2f\n", length2);
        
        System.out.println("\nEquality Check:");
        Double l1 = length1;
        Double l2 = length2;

        // UC 2 - Equality check
        if (l1.equals(l2)) {
            System.out.println("Lines are equal");
        } else {
            System.out.println("Lines are not equal");
        }
        

        // UC 3 - Comparison
        System.out.println("\nComparison:");
        if (length1 == length2) {
            System.out.println("Line 1 is equal to Line 2");
        } else if (length1 > length2) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Line 1 is less than Line 2");
        }
        
        scanner.close();
    }
}