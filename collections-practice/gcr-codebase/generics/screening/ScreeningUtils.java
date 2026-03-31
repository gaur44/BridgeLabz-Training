package screening;

import java.util.List;

public class ScreeningUtils {

    // Generic method process one resume safely
    public static <T extends JobRole> void processResume(Resume<T> resume) {
        System.out.println(
            resume.getCandidateName() + " applying for "
            + resume.getJobRole().getRoleName()
            + " -> " + (resume.getJobRole().isQualified() ? "Qualified" : "Rejected")
        );
    }

    // Wildcard method handle multiple job roles
    public static void runPipeline(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Screening pipeline ready for: " + role.getRoleName());
        }
    }
}

