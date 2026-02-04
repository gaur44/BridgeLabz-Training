public class Main {
    public static void main(String[] args) {
        DeliveryService d = new DeliveryService();

        d.addAgent(new Agent(1, 10));
        d.addAgent(new Agent(2, 30));

        d.addOrder(new Order(1, 12));
        d.addOrder(new Order(2, 25));

        try {
            d.assignOrder();
            d.assignOrder();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        d.viewActiveDeliveries();
    }
}

