class CourseLimitExceededException extends Exception {
    public CourseLimitExceededException(String msg) {
        super(msg);
    }
}

interface RegistrationService {
    void enrollCourse(Course course) throws CourseLimitExceededException;
    void dropCourse(Course course);
    void viewGrades();
}

class Person {
    protected String name;
    protected String email;
    
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
}

class Course {
    private String code;
    private String name;
    private int credits;
    
    public Course(String code, String name, int credits) {
        this.code = code;
        this.name = name;
        this.credits = credits;
    }
    
    public String getCode() {
        return code;
    }
    
    public String getName() {
        return name;
    }
    
    public int getCredits() {
        return credits;
    }
}

class Student extends Person implements RegistrationService {
    private String studentId;
    private Course[] enrolledCourses;
    private String[] grades;
    private int courseCount;
    private int maxCourses = 5;
    
    public Student(String studentId, String name, String email) {
        super(name, email);
        this.studentId = studentId;
        this.enrolledCourses = new Course[maxCourses];
        this.grades = new String[maxCourses];
        this.courseCount = 0;
    }
    
    public void enrollCourse(Course course) throws CourseLimitExceededException {
        if(courseCount >= maxCourses) {
            throw new CourseLimitExceededException("Cannot enroll more than " + maxCourses + " courses");
        }
        enrolledCourses[courseCount] = course;
        grades[courseCount] = "Not graded";
        courseCount++;
        System.out.println("Enrolled in " + course.getName());
    }
    
    public void dropCourse(Course course) {
        for(int i = 0; i < courseCount; i++) {
            if(enrolledCourses[i].getCode().equals(course.getCode())) {
                // shift courses left
                for(int j = i; j < courseCount - 1; j++) {
                    enrolledCourses[j] = enrolledCourses[j + 1];
                    grades[j] = grades[j + 1];
                }
                courseCount--;
                System.out.println("Dropped " + course.getName());
                return;
            }
        }
        System.out.println("Course not found");
    }
    
    public void viewGrades() {
        System.out.println("\nGrades for " + name + ":");
        for(int i = 0; i < courseCount; i++) {
            System.out.println(enrolledCourses[i].getName() + " - " + grades[i]);
        }
    }
    
    public void assignGrade(String courseCode, String grade) {
        for(int i = 0; i < courseCount; i++) {
            if(enrolledCourses[i].getCode().equals(courseCode)) {
                grades[i] = grade;
                System.out.println("Grade " + grade + " assigned for " + enrolledCourses[i].getName());
                return;
            }
        }
    }
}

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        Student s1 = new Student("S001", "Riya", "riya@college.com");
        
        Course c1 = new Course("CS101", "Data Structures", 4);
        Course c2 = new Course("CS102", "Algorithms", 4);
        Course c3 = new Course("CS103", "DBMS", 3);
        
        try {
            s1.enrollCourse(c1);
            s1.enrollCourse(c2);
            s1.enrollCourse(c3);
            
            s1.assignGrade("CS101", "A");
            s1.assignGrade("CS102", "B+");
            
            s1.viewGrades();
            
            s1.dropCourse(c3);
            s1.viewGrades();
            
        } catch(CourseLimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}