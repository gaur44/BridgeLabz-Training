public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee employee = new Employee("Rahul", "ABC1", 30000);
        employee.displayDetails();
        System.out.println();

        Manager manager = new Manager("Ram", "MNG1", 40000, 10);
        manager.displayDetails();
        System.out.println();

        Developer developer = new Developer("Harsh", "DEV1", 40000, "Python");
        developer.displayDetails();
        System.out.println();

        Intern intern = new Intern("Shubh", "INT1", 20000, 45);
        intern.displayDetails();
        System.out.println();
    }
}


class Employee {
    String name;
    String id;
    double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    public Manager(String name, String id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, String id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    int internshipDuration;

    public Intern(String name, String id, double salary, int internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + internshipDuration);
    }
}