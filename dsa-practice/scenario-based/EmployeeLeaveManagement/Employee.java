public class Employee {
    int id;
    String name;
    int leaveBalance;

    public Employee(int id, String name, int leaveBalance) {
        this.id = id;
        this.name = name;
        this.leaveBalance = leaveBalance;
    }

    @Override
    public String toString() {
        return name + " (balance=" + leaveBalance + ")";
    }
}
