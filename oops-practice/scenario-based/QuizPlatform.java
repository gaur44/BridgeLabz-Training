import java.util.*;

class InvalidQuizSubmissionException extends Exception {
    InvalidQuizSubmissionException(String m) {
        super(m);
    }
}

public class QuizPlatform {

    static int check(String[] a, String[] b) throws InvalidQuizSubmissionException {
        if (a.length != b.length)
            throw new InvalidQuizSubmissionException("Answers count not same");

        int s = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(b[i]))
                s++;
        }
        return s;
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
