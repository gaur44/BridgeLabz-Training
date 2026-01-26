import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeSerialization {

    public static void main(String[] args) {

        String filename = "employees.ser";

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "HR", 50000));
        employees.add(new Employee(2, "Bob", "IT", 70000));
        employees.add(new Employee(3, "Charlie", "Finance", 60000));

        // Serialize
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(filename))) {

            oos.writeObject(employees);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize and display
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(filename))) {

            List<Employee> savedEmployees =
                    (List<Employee>) ois.readObject();

            for (Employee emp : savedEmployees) {
                System.out.println(
                        emp.id + " " +
                        emp.name + " " +
                        emp.department + " " +
                        emp.salary
                );
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

