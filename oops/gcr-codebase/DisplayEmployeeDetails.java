public class DisplayEmployeeDetails {
    // Attributes of Employee
    String name;
    int id;
    double salary;

    // initialize employee details
    public DisplayEmployeeDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        DisplayEmployeeDetails emp = new DisplayEmployeeDetails("Rohan", 1, 500000);
        emp.displayDetails();
    }
}
