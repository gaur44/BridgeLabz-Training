public class Main {
    public static void main(String[] args) {

        AttendanceTracker t = new AttendanceTracker();

        try {
            t.markAttendance("S1", "A101");
            t.markAttendance("S1", "A102");
            t.markAttendance("S1", "A101"); // duplicate
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        t.displayAttendance("S1");
        t.removeAttendance("S1", "A102");
        t.displayAttendance("S1");
    }
}

