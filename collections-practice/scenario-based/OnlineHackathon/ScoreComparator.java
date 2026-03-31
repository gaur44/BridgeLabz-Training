import java.util.Comparator;

public class ScoreComparator implements Comparator<Participant> {
    public int compare(Participant a, Participant b) {
        return b.getScore() - a.getScore();
    }
}
