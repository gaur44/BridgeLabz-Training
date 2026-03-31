import java.util.Scanner;

public class FootballTeamHeights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heightsArr = new double[11];
        double min = Double.MAX_VALUE, max = Double.MIN_VALUE, sum = 0;

        for (int i = 0; i < 11; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heightsArr[i] = sc.nextDouble();
            if (heightsArr[i] < min) min = heightsArr[i];
            if (heightsArr[i] > max) max = heightsArr[i];
            sum += heightsArr[i];
        }

        double avg = sum / 11;
        System.out.printf("Average height: %.2f, Min height: %.2f, Max height: %.2f%n", avg, min, max);
    }
}