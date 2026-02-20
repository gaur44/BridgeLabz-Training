import java.util.*;

public class TrafficSystem {

    private Map<String, List<Violation>> map = new HashMap<>();

    public void addViolation(String vehicle, String type) throws InvalidVehicleException {
        if (vehicle == null || vehicle.isEmpty())
            throw new InvalidVehicleException("Invalid vehicle number");

        map.computeIfAbsent(vehicle, k -> new ArrayList<>())
           .add(new Violation(type));
    }

    public int calculateFine(String vehicle) {
        List<Violation> list = map.get(vehicle);
        if (list == null) return 0;

        FineStrategy strategy =
                list.size() > 2 ? new RepeatOffenderFine() : new NormalFine();

        int total = 0;
        for (Violation v : list)
            total += strategy.calculateFine(v.getType());

        return total;
    }

    public void monthlyReport() {
        for (String v : map.keySet()) {
            System.out.println(v + " Fine=" + calculateFine(v));
        }
    }
}
