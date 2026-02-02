public class Student {

    private String name;
    private int rollNo;

    public Student() {
        name = "Default";
        rollNo = 0;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {

        try {
            // Load class dynamically
            Class<?> cls = Class.forName("Student");

            // Create object without using new
            Student s = (Student) cls.getDeclaredConstructor().newInstance();

            // Call method
            s.display();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

