public class Employee {
    // static fields
    private static String companyName = "Tech Solutions Inc.";
    private static int totalEmployees = 0;
    
    // instance variables
    private String name;
    private final String id; // id cannot be changed later
    private String designation;

    // constructor
    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // method to display employee details
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid Instance.");
        }
    }

    // print the given output
    public static void main(String[] args) {
        Employee emp1 = new Employee("Thamarai", "101", "Software Engineer");
        Employee emp2 = new Employee("Rohan", "102", "Project Manager");

        System.out.println("Total Employees: " + totalEmployees);
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
    }
}