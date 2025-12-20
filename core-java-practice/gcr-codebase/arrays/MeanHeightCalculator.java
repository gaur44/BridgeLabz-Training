import java.util.Scanner;

public class MeanHeightCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sumHeights = 0;

        System.out.println("Enter the height of 11 players:");
        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
            sumHeights += heights[i];
        }

        double mean = sumHeights / 11;
        System.out.println("Mean height: " + mean);
    }
}