import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, ReliefCenter> centers = new HashMap<>();

        ReliefCenter rc = new ReliefCenter("Center1");
        rc.addResource("Food", 100);
        rc.addResource("Water", 50);
        rc.addResource("MedKit", 20);

        centers.put("C1", rc);

        Queue<AreaRequest> queue = new LinkedList<>();

        queue.add(new AreaRequest("AreaA", Map.of("Food", 30, "Water", 10)));
        queue.add(new AreaRequest("AreaB", Map.of("Food", 80))); // fail
        queue.add(new AreaRequest("AreaC", Map.of("MedKit", 5)));

        while (!queue.isEmpty()) {
            AreaRequest req = queue.poll(); // FIFO

            try {
                centers.get("C1").allocate(req);
            } catch (InsufficientResourceException e) {
                System.out.println("Failed: " + e.getMessage());
            }
        }

        // report
        centers.get("C1").printStock();
    }
}
