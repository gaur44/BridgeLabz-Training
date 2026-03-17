import java.util.*;

public class QuizRanking {

    static class Student {
        String name;
        String dept;
        int q1, q2, q3;

        Student(String name, String dept, int q1, int q2, int q3) {
            this.name = name;
            this.dept = dept;
            this.q1 = q1;
            this.q2 = q2;
            this.q3 = q3;
        }

        int total() {
            return q1 + q2 + q3;
        }
    }

    static List<Student> records = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");

            if (parts[0].equals("Record")) {
                String name = parts[1];
                String dept = parts[2];
                int q1 = Integer.parseInt(parts[3]);
                int q2 = Integer.parseInt(parts[4]);
                int q3 = Integer.parseInt(parts[5]);

                record(name, dept, q1, q2, q3);
            } else if (parts[0].equals("Top")) {
                String param = parts[1];
                top(param);
            }
        }

        sc.close();
    }

    private static void record(String name, String dept, int q1, int q2, int q3) {
        records.add(new Student(name, dept, q1, q2, q3));
        System.out.println("Record Added: " + name);
    }

    private static void top(String param) {

        if (records.isEmpty()) {
            System.out.println("No Records Available");
            return;
        }

        if (param.equals("Q1") || param.equals("Q2") || param.equals("Q3")) {
            topByQuiz(param);
        } else {
            topByDepartment(param);
        }
    }

    private static void topByDepartment(String dept) {
        int max = -1;
        boolean found = false;

        for (Student s : records) {
            if (s.dept.equals(dept)) {
                found = true;
                max = Math.max(max, s.total());
            }
        }

        if (!found) {
            System.out.println("Department Not Found");
            return;
        }

        for (Student s : records) {
            if (s.dept.equals(dept) && s.total() == max) {
                System.out.println(s.name + " " + max);
            }
        }
    }

    private static void topByQuiz(String quiz) {
        int max = -1;

        for (Student s : records) {
            int val = getQuizValue(s, quiz);
            max = Math.max(max, val);
        }

        for (Student s : records) {
            int val = getQuizValue(s, quiz);
            if (val == max) {
                System.out.println(s.name + " " + max);
            }
        }
    }

    private static int getQuizValue(Student s, String quiz) {
        if (quiz.equals("Q1")) return s.q1;
        if (quiz.equals("Q2")) return s.q2;
        return s.q3;
    }
}
