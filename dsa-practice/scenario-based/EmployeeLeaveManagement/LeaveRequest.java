public class LeaveRequest {
    int empId;
    int days;
    String status;

    public LeaveRequest(int empId, int days) {
        this.empId = empId;
        this.days = days;
        this.status = "PENDING";
    }

    @Override
    public String toString() {
        return "Emp " + empId + " -> " + days + " days : " + status;
    }
}
