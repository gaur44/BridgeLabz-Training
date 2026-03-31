public class Main {
    public static void main(String[] args) {

        TrafficSystem t = new TrafficSystem();

        try {
            t.addViolation("KA01", "SignalJump");
            t.addViolation("KA01", "NoHelmet");
            t.addViolation("KA01", "Parking");

            t.addViolation("KA02", "NoHelmet");

        } catch (InvalidVehicleException e) {
            System.out.println(e.getMessage());
        }

        t.monthlyReport();
    }
}
