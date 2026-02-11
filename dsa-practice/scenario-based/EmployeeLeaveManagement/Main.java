public class Main {
    public static void main(String[] args) {

        LeaveService service = new LeaveService();

        service.addEmployee(new Employee(1, "Agraj", 5));
        service.addEmployee(new Employee(2, "Amit", 2));

        service.applyLeave(1, 3);
        service.applyLeave(2, 5);  // more than balance

        try {
            service.approve(0);
            service.approve(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        service.viewRequests();
    }
}
