import java.util.Map;

public class Participant {
    private String name;
    private Map<String, Boolean> results;
    private boolean late;
    private int score;

    public Participant(String name, Map<String, Boolean> results, boolean late)
            throws LateSubmissionException {
        if (late)
            throw new LateSubmissionException(name + " submitted late");

        this.name = name;
        this.results = results;
        this.late = late;
        calculateScore();
    }

    public void calculateScore() {
        score = 0;
        for (boolean r : results.values())
            if (r) score++;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " Score=" + score;
    }
}
