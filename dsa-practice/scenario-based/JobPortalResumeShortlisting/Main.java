import java.util.*;

public class Main {
    public static void main(String[] args) {

        ResumeService service = new ResumeService();

        try {
            service.addResume(new Resume(1, "Agraj",
                    new HashSet<>(Arrays.asList("Java", "SQL"))));

            service.addResume(new Resume(2, "Amit",
                    new HashSet<>(Arrays.asList("Python", "ML"))));

            service.addResume(new Resume(3, "Harsh",
                    new HashSet<>(Arrays.asList("Java", "ML", "SQL"))));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Set<String> jobSkills =
                new HashSet<>(Arrays.asList("Java", "SQL"));

        service.rank(jobSkills);
        service.show();
    }
}
