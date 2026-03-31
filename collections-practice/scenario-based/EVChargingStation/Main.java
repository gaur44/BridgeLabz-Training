import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Integer, ChargingSlot> slots = new HashMap<>();
        for (int i = 1; i <= 2; i++)
            slots.put(i, new ChargingSlot(i));

        Queue<Vehicle> queue = new LinkedList<>();
        queue.add(new Vehicle("KA01", 10));
        queue.add(new Vehicle("KA02", 5));
        queue.add(new Vehicle("KA03", 7));

        PricingStrategy pricing = new PeakPricing(); // polymorphism

        while (!queue.isEmpty()) {
            Vehicle v = queue.poll();

            try {
                ChargingSlot freeSlot = null;

                for (ChargingSlot s : slots.values()) {
                    if (!s.isOccupied()) {
                        freeSlot = s;
                        break;
                    }
                }

                if (freeSlot == null)
                    throw new NoChargingSlotAvailableException("No slot for " + v.getNumber());

                freeSlot.occupy();

                double bill = pricing.calculate(v.getUnitsNeeded());
                System.out.println(v.getNumber() + " charged. Bill=" + bill);

                freeSlot.free();

            } catch (NoChargingSlotAvailableException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
