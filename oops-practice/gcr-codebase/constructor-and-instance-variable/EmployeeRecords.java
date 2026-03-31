class Employee {
    public int employeeID;
    protected String department;
    private double salary;
    
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    
    // setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

// manager subclass
class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }
    
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

class EmployeeRecords {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "IT", 50000);
        e1.setSalary(55000);
        
        Manager m1 = new Manager(201, "Sales", 75000);
        m1.displayDetails();
    }
}