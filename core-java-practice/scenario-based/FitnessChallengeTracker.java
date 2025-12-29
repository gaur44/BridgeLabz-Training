import java.util.Scanner;

public class FitnessChallengeTracker {
    public static void main(String[] args) {
        System.out.println("Fitness Challenge Tracker");
        int[] weekPushups = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < weekPushups.length; i++) {
            System.out.println("Enter the number of pushups done on day " + (i+1) + " (0 for rest day): ");
            weekPushups[i] = sc.nextInt();
        }

        int totalPushups = 0;
        int days = 0;
        for (int pushups : weekPushups) {
            if (pushups != 0) {
                totalPushups += pushups;
                days++;
            }
        }
        double average = (double) totalPushups / days;
        System.out.println("Results");
        System.out.println("Total Pushups: " + totalPushups);
        System.out.println("Week average: " + average);
    }
}
