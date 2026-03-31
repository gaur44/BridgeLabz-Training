import java.util.*;

class InvalidQuizSubmissionException extends Exception {
    InvalidQuizSubmissionException(String message) {
        super(message);
    }
}

public class QuizPlatform {
    static int check(String[] correctAnswers, String[] userAnswers) throws InvalidQuizSubmissionException {
        if (correctAnswers.length != userAnswers.length)
            throw new InvalidQuizSubmissionException("Answers count not same");

        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equals(userAnswers[i]))
                score++;
        }
        return score;
    }

    static String grade(int m, int t) {
        int p = (m * 100) / t;

        if (p >= 80) return "A";
        if (p >= 60) return "B";
        if (p >= 40) return "C";
        return "Fail";
    }

    public static void main(String[] args) {

        String[] right = {"A", "B", "C", "D"};
        String[] user1 = {"A", "B", "A", "D"};

        List<Integer> scores = new ArrayList<>();

        try {
            int sc = check(right, user1);
            scores.add(sc);

            System.out.println("Score: " + sc);
            System.out.println("Grade: " + grade(sc, right.length));

        } catch (InvalidQuizSubmissionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("All scores: " + scores);
    }
}
