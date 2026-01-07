import java.util.Scanner;

public class StudentScoreAnalyzer {
    public static void analyzeScores() {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of students: ");
        int n = sc.nextInt();

        float[] scores = new float[n];
        float sum = 0;

        sc.close();
        // get scores
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("enter score for student " + (i + 1) + ": ");
                if (sc.hasNextFloat()) {
                    float score = sc.nextFloat();
                    if (score >= 0) {
                        scores[i] = score;
                        sum += score;
                        break;
                    } else {
                        System.out.println("Score cannot be negative.");
                    }
                } else {
                    System.out.println("Invalid input. Enter a number.");
                    sc.next();
                }
            }
        }

        float average = sum / n;

        float maxScore = scores[0];
        float minScore = scores[0];

        // highest and lowest score
        for (int i = 1; i < n; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
            if (scores[i] < minScore) {
                minScore = scores[i];
            }
        }

        System.out.println("\nAverage Score: " + average);
        System.out.println("Highest Score: " + maxScore);
        System.out.println("Lowest Score: " + minScore);

        System.out.println("Scores above average:");
        for (int i = 0; i < n; i++) {
            if (scores[i] > average) {
                System.out.println(scores[i]);
            }
        }
    }

    public static void main(String[] args) {
        analyzeScores();
    }
}
