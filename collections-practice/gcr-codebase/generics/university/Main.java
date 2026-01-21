package university;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course<ExamCourse> math = new Course<>("Mathematics");
        math.addStudent(new ExamCourse("Calculus Exam"));
        math.addStudent(new ExamCourse("Algebra Exam"));

        Course<AssignmentCourse> cs = new Course<>("Computer Science");
        cs.addStudent(new AssignmentCourse("Java Assignment"));
        cs.addStudent(new AssignmentCourse("Python Project"));

        Course<ResearchCourse> physics = new Course<>("Physics");
        physics.addStudent(new ResearchCourse("Quantum Mechanics Paper"));
        physics.addStudent(new ResearchCourse("Relativity Research"));

        System.out.println("Mathematics Course:");
        CourseUtils.displayCourse(math.getEvaluations());

        System.out.println("\nComputer Science Course:");
        CourseUtils.displayCourse(cs.getEvaluations());

        System.out.println("\nPhysics Course:");
        CourseUtils.displayCourse(physics.getEvaluations());
    }
}

