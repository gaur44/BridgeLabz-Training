import java.util.*;

public class ResumeService {

    List<Resume> resumes = new ArrayList<>();

    public void addResume(Resume r) throws InvalidResumeException {
        if (r.skills == null || r.skills.isEmpty()) {
            throw new InvalidResumeException("Resume must have skills");
        }
        resumes.add(r);
    }

    public void rank(Set<String> requiredSkills) {

        for (Resume r : resumes) {
            int count = 0;
            for (String s : r.skills) {
                if (requiredSkills.contains(s)) count++;
            }
            r.score = count;
        }

        resumes.sort((a, b) -> b.score - a.score);
    }

    public void show() {
        for (Resume r : resumes) {
            System.out.println(r);
        }
    }
}
