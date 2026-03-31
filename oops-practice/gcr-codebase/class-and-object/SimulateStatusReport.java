public class SimulateStatusReport {

    // Main method to test the class
    public static void main(String[] args) {
        Student student = new Student("Thamarai", 101, 82);
        student.displayDetails();
    }
}

class Student {
    String name;
    int rollNumber;
    int marks;

    // Constructor to initialize student attributes
    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // method for calculating grade
    public String computeGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 50)
            return "D";
        else
            return "F";
    }

    // display results
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + computeGrade());
    }

}