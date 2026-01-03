public class EduQuiz {
    public static void main(String[] args) {

        String[] correctAnswers = {
            "A", "C", "B", "D", "A",
            "B", "C", "D", "A", "C"
        };

        String[] studentAnswers = {
            "a", "c", "b", "a", "a",
            "b", "d", "d", "A", "c"
        };

        int score = calculateTestScore(correctAnswers, studentAnswers);

        System.out.println("\nFinal Score: " + score + "/10");

        double percentage = (score / 10.0) * 100;
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    static int calculateTestScore(String[] correct, String[] student) {
        int score = 0;

        for (int i = 0; i < correct.length; i++) {
            if (student[i].equalsIgnoreCase(correct[i])) {
                System.out.println("Question " + (i + 1) + ": Correct");
                score++;
            } else {
                System.out.println("Question " + (i + 1) + ": Incorrect");
            }
        }

        return score;
    }
}
