import java.util.*;
import java.util.stream.Collectors;

public class StudentResultGrouping {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Agraj", "A"));
        students.add(new Student("Amit", "B"));
        students.add(new Student("Rohit", "A"));
        students.add(new Student("Aman", "B"));

        Map<String, List<String>> result =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getGrade,
                                Collectors.mapping(Student::getName, Collectors.toList())
                        ));

        System.out.println(result);
    }
}

