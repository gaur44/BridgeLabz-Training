import java.util.Random;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Random rndm = new Random();
        int[][] marks = new int[5][3];

        System.out.println("Phy\tChem\tMath\tTotal\t%\tGrade");
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                marks[i][j] = rndm.nextInt(41) + 60;
                total += marks[i][j];
            }
            double percentage = total / 3.0;
            String grade = percentage >= 90 ? "A+" : percentage >= 80 ? "A" : percentage >= 70 ? "B" : percentage >= 60 ? "C" : "D";

            System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%s\n", marks[i][0], marks[i][1], marks[i][2], total, percentage,grade);
        }
    }
}