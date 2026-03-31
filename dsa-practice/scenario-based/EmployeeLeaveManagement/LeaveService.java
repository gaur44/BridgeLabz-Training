import java.util.*;

public class LeaveService {

    Map<Integer, Employee> employees = new HashMap<>();
    List<LeaveRequest> requests = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.put(e.id, e);
    }

    public void applyLeave(int empId, int days) {
        requests.add(new LeaveRequest(empId, days));
    }

    public void approve(int index) throws InsufficientLeaveBalanceException {
        LeaveRequest r = requests.get(index);
        Employee e = employees.get(r.empId);

        if (e.leaveBalance < r.days) {
            throw new InsufficientLeaveBalanceException("Not enough balance");
        }

        e.leaveBalance -= r.days;
        r.status = "APPROVED";
    }

    public void reject(int index) {
        requests.get(index).status = "REJECTED";
    }

    public void viewRequests() {
        for (LeaveRequest r : requests) {
            System.out.println(r);
        }
    }
}
