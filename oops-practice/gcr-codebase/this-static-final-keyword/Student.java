public class Student {

    // static variables
    private static String universityName = "Global University";
    private static int totalStudents = 0;

    private String name;
    // final keyword
    private final int rollNumber;
    private String grade;

    // constructor using this keyword
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // method to display student details
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid student instance.");
        }
    }

    // method to update grade
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + newGrade);
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student("Hemashree", 101, "A");
        Student s2 = new Student("Sharmila", 102, "B");

        displayTotalStudents();

        s1.displayStudentDetails();
        s2.displayStudentDetails();

        s2.updateGrade("A");
        s2.displayStudentDetails();
    }
}
