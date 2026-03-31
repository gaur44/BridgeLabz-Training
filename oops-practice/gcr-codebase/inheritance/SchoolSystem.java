public class SchoolSystem {
    public static void main(String[] args) {

        Person p1 = new Teacher("Rohit", 35, "Mathematics");
        Person p2 = new Student("Rohan", 16, "10th Grade");
        Person p3 = new Staff("Rahul", 45, "Administration");

        p1.displayRole();
        p2.displayRole();
        p3.displayRole();
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayRole() {
        System.out.println("Role: Person");
    }
}

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
    }
}

class Student extends Person {
    String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role: Student");
    }
}

class Staff extends Person {
    String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role: Staff");
    }
}
