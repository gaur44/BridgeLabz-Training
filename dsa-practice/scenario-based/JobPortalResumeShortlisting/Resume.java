import java.util.*;

public class Resume {
    int id;
    String name;
    Set<String> skills;
    int score;   // number of matches

    public Resume(int id, String name, Set<String> skills) {
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return name + " score=" + score;
    }
}
