import java.util.*;

class InvalidMarkException extends Exception {
    InvalidMarkException(String m) {
        super(m);
    }
}

class Student {
    String name;
    int[] marks;

    Student(String n, int[] m) {
        name = n;
        marks = m;
    }
}

public class StudentReportGenerator {

    static double avg(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++)
            s += a[i];
        return (double) s / a.length;
    }

    static String grade(double p) {
        if (p >= 80) return "A";
        if (p >= 60) return "B";
        if (p >= 40) return "C";
        return "Fail";
    }

    static void check(int[] a) throws InvalidMarkException {
        for (int i = 0; i < a.length; i++)
            if (a[i] < 0 || a[i] > 100)
                throw new InvalidMarkException("Wrong mark: " + a[i]);
    }

    static void show(Student s, String[] sub) {
        System.out.println("\nReport for " + s.name);
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
            list.add(new Student("Riya", m2));

        } catch (InvalidMarkException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (Student s : list)
            show(s, subs);
    }
}
