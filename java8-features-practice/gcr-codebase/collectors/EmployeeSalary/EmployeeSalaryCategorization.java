import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSalaryCategorization {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Agraj", "IT", 50000));
        employees.add(new Employee("Aman", "IT", 60000));
        employees.add(new Employee("Rohan", "HR", 40000));
        employees.add(new Employee("Mukul", "HR", 45000));
        employees.add(new Employee("Harsh", "Finance", 55000));

        Map<String, Double> avgSalaryByDept =
                employees.stream()
                         .collect(Collectors.groupingBy(
                                 Employee::getDepartment,
                                 Collectors.averagingDouble(Employee::getSalary)
                         ));

        System.out.println(avgSalaryByDept);
    }
}

