package university;

import java.util.List;

public class CourseUtils {

    // Display any type of course evaluations dynamically
    public static void displayCourse(List<? extends CourseType> evaluations) {
        for (CourseType eval : evaluations) {
            System.out.println(eval.getEvaluationType() + " -> " + eval.getDescription());
        }
    }
}

