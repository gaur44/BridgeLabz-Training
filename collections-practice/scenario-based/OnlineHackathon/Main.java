import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Participant> list = new ArrayList<>();

        try {
            list.add(new Participant("Aman", Map.of("Q1", true, "Q2", false), false));
            list.add(new Participant("Agraj", Map.of("Q1", true, "Q2", true), false));
            list.add(new Participant("Amit", Map.of("Q1", false, "Q2", false), false));
        } catch (LateSubmissionException e) {
            System.out.println(e.getMessage());
        }

        Collections.sort(list, new ScoreComparator());

        System.out.println("Leaderboard");
        for (Participant p : list)
            System.out.println(p);
    }
}
