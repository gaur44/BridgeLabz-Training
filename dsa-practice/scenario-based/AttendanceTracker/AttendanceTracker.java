import java.util.*;

public class AttendanceTracker {

    Map<String, Set<String>> attendance = new HashMap<>();

    void markAttendance(String sessionId, String studentId)
            throws DuplicateAttendanceException {

        attendance.putIfAbsent(sessionId, new HashSet<>());
        Set<String> students = attendance.get(sessionId);

        if (students.contains(studentId))
            throw new DuplicateAttendanceException("Already marked");

        students.add(studentId);
    }

    void removeAttendance(String sessionId, String studentId) {
        if (attendance.containsKey(sessionId))
            attendance.get(sessionId).remove(studentId);
    }

    void displayAttendance(String sessionId) {
        Set<String> students = attendance.get(sessionId);
        if (students == null)
            System.out.println("No attendance");
        else
            System.out.println(students);
    }
}

