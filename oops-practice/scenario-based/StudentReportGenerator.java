import java.util.*;

class InvalidMarkException extends Exception {
    InvalidMarkException(String message) {
        super(message);
    }
}

class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentReportGenerator {
    static double avg(int[] marks) {
        int sumMarks = 0;
        for (int i = 0; i < marks.length; i++)
            sumMarks += marks[i];
        return (double) sumMarks / marks.length;
    }

    static String grade(double score) {
        if (score >= 80) return "A";
        if (score >= 60) return "B";
        if (score >= 40) return "C";
        return "Fail";
    }

    static void check(int[] marks) throws InvalidMarkException {
        for (int i = 0; i < marks.length; i++)
            if (marks[i] < 0 || marks[i] > 100)
                throw new InvalidMarkException("Wrong mark: " + marks[i]);
    }

    static void show(Student s, String[] sub) {
        System.out.println();
        System.out.println("Report for " + s.name);
        for (int i = 0; i < sub.length; i++)
            System.out.println(sub[i] + " : " + s.marks[i]);

        double a = avg(s.marks);
        System.out.println("Avg: " + a);
        System.out.println("Grade: " + grade(a));
    }

    public static void main(String[] args) {

        String[] subs = {"Math", "Sci", "Eng"};

        List<Student> list = new ArrayList<>();

        int[] m1 = {80, 70, 90};
        int[] m2 = {50, 30, 110};   // wrong

        try {
            check(m1);
            list.add(new Student("Aman", m1));

            check(m2);   // will fail
            list.add(new Student("Rohan", m2));

        } catch (InvalidMarkException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (Student student : list)
            show(student, subs);
    }
}
