import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {
        double[] nums = new double[10];
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        System.out.println("Enter numbers (0 to exit): ");
        while (true) {
            double current = scanner.nextDouble();
            if (current <= 0) {
                break;
            }
            nums[counter] = current;
            counter++;
            if (counter == nums.length) {
                break;
            }
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                break;
            } 
            sum += nums[i];
            System.out.println("Number at index " + i + ": " + nums[i]);
        }
        System.out.println("Sum: " + sum);
    }
}