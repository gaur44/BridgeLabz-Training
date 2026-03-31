class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;
    
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    

    // getter for cgpa
    public double getCGPA() {
        return CGPA;
    }
    
    // setter for cgpa
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {
    String researchArea;
    
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchArea) {
        super(rollNumber, name, CGPA);
        this.researchArea = researchArea;
    }
    
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Research Area: " + researchArea);
    }
}

class UniversityManagementSystem {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Rohan", 8.5);
        System.out.println("Student CGPA: " + student1.getCGPA());
        
        student1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + student1.getCGPA());
        System.out.println();
        
        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Ram", 8.8, "ML");
        pg1.displayDetails();
    }
}