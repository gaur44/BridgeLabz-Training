import java.util.*;

public class DeliveryService {

    Queue<Order> orders = new LinkedList<>();
    List<Agent> agents = new ArrayList<>();

    void addOrder(Order o) {
        orders.add(o);
    }

    void addAgent(Agent a) {
        agents.add(a);
    }

    void assignOrder() throws NoAgentAvailableException {
        if (orders.isEmpty()) return;

        Order o = orders.peek();
        Agent best = null;
        int min = Integer.MAX_VALUE;

        for (Agent a : agents) {
            if (a.free) {
                int d = Math.abs(a.location - o.location);
                if (d < min) {
                    min = d;
                    best = a;
                }
            }
        }

        if (best == null)
            throw new NoAgentAvailableException("No agent free");

        orders.poll();
        best.free = false;

        System.out.println("Order " + o.id + " -> Agent " + best.id);
    }

    void cancelOrder(int id) {
        orders.removeIf(o -> o.id == id);
    }

    void viewActiveDeliveries() {
        for (Agent a : agents)
            if (!a.free)
                System.out.println("Agent " + a.id + " busy");
    }
}

