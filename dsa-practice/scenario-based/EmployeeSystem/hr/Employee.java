package hr;

abstract class Employee {

    private final String name;
    private final double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double getSalary() {
        return salary;
    }

    abstract double getBonus();
}

