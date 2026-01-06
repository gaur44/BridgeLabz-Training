public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];

        Employee e1 = new FullTimeEmployee("ABC101", "Rahul", 50000);
        Employee e2 = new PartTimeEmployee("ABC202", "Rohan", 500, 40);

        employees[0] = e1;
        employees[2] = e2;

        // list of employees
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println();
        }
    }
}

abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;

    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }

    // getters and setters
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}

interface Department {
    void assignDepartment(String department);

    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {

    private String department;

    public FullTimeEmployee(String employeeId, String name, double salary) {
        super(employeeId, name, salary);
        this.department = "Not Assigned";
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}

class PartTimeEmployee extends Employee implements Department {

    private int hoursWorked;
    private String department;

    public PartTimeEmployee(String employeeId, String name,
            double hourlyRate, int hoursWorked) {
        super(employeeId, name, hourlyRate);
        this.hoursWorked = hoursWorked;
        this.department = "Not Assigned";
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * hoursWorked;
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}
