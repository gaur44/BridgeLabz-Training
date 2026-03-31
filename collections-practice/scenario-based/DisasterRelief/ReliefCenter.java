import java.util.HashMap;
import java.util.Map;

public class ReliefCenter {
    private String name;
    private Map<String, Integer> stock = new HashMap<>();

    public ReliefCenter(String name) {
        this.name = name;
    }

    public void addResource(String item, int qty) {
        stock.put(item, stock.getOrDefault(item, 0) + qty);
    }

    public void allocate(AreaRequest req) throws InsufficientResourceException {
        for (String item : req.getRequestedResources().keySet()) {
            int needed = req.getRequestedResources().get(item);
            int available = stock.getOrDefault(item, 0);

            if (available < needed) {
                throw new InsufficientResourceException(
                    "Not enough " + item + " for " + req.getAreaName()
                );
            }
        }

        // deduct after validation
        for (String item : req.getRequestedResources().keySet()) {
            int needed = req.getRequestedResources().get(item);
            stock.put(item, stock.get(item) - needed);
        }

        System.out.println("Allocated to " + req.getAreaName());
    }

    public void printStock() {
        System.out.println("Stock at " + name + ": " + stock);
    }
}
