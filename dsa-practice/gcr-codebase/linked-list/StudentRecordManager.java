class StudentNode {
    StudentNode next;
    private int rollNumber;
    private String name;
    private int age;
    private String grade;

    public StudentNode(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

class LinkedList {
    StudentNode head;

    public LinkedList() {
        this.head = null;
    }

    public void addStudentEnd(int rollNumber, String name, int age, String grade) {
        StudentNode student = new StudentNode(rollNumber, name, age, grade);
        if (head == null) {
            head = student;
        } else {
            StudentNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = student;
        }
    }

    public void addStudentBeginning(int rollNumber, String name, int age, String grade) {
        StudentNode student = new StudentNode(rollNumber, name, age, grade);
        student.next = head;
        head = student;
    }

    public void addStudentAtPosition(int position, int rollNumber, String name, int age, String grade) {
        StudentNode student = new StudentNode(rollNumber, name, age, grade);

        // insert at beginning
        if (position <= 0 || head == null) {
            student.next = head;
            head = student;
            return;
        }

        StudentNode curr = head;
        int index = 0;

        while (curr.next != null && index < position - 1) {
            curr = curr.next;
            index++;
        }

        student.next = curr.next;
        curr.next = student;
    }

    public void deleteByRoll(int rollNumber) {
        if (head == null) return;

        if (head.getRollNumber() == rollNumber) {
            head = head.next;
            return;
        }

        StudentNode prev = head;
        StudentNode curr = head.next;

        while (curr != null) {
            if (curr.getRollNumber() == rollNumber) {
                prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public String searchByRoll(int rollNumber) {
        StudentNode curr = head;

        while (curr != null) {
            if (curr.getRollNumber() == rollNumber) {
                System.out.println("Student Found!");
                return curr.toString();
            }
            curr = curr.next;
        }

        System.out.println("Student Not Found!");
        return null;
    }

    public void upgradeGrade(int rollNumber, String grade) {
        StudentNode curr = head;

        while (curr != null) {
            if (curr.getRollNumber() == rollNumber) {
                curr.setGrade(grade);
                System.out.println("Grade upgraded");
                return;
            }
            curr = curr.next;
        }

        System.out.println("Could not upgrade grade: no such student");
    }

    public void displayAllRecords() {
        StudentNode curr = head;
        while (curr != null) {
            System.out.println(curr.getName() + " Roll: " + curr.getRollNumber() + " Age: " + curr.getAge() + " Grade: " + curr.getGrade());
            curr = curr.next;
        }
    }
}

public class StudentRecordManager {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addStudentEnd(12, "Arjun", 40, "A+");
        linkedList.addStudentEnd(10, "Aman", 30, "O");
        linkedList.addStudentEnd(11, "Rahul", 20, "A+");
        linkedList.addStudentEnd(14, "Ram", 22, "A+");
        linkedList.addStudentEnd(19, "Rohan", 22, "A+");

        linkedList.displayAllRecords();

        linkedList.addStudentAtPosition(2, 99, "Anuj", 25, "B");

        linkedList.displayAllRecords();
        System.out.println(linkedList.searchByRoll(12));

        linkedList.deleteByRoll(10);
        linkedList.deleteByRoll(14);
        linkedList.deleteByRoll(12);

        linkedList.displayAllRecords();
    }
}
