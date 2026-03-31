import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<WaterTank> tanks = new ArrayList<>();

        try {
            tanks.add(new WaterTank("T1", 100, 50));
            tanks.add(new WaterTank("T2", 200, 30));
            tanks.add(new WaterTank("T3", 150, 10));
        } catch (InvalidWaterLevelException e) {
            System.out.println(e.getMessage());
        }

        for (WaterTank t : tanks)
            t.checkAlert();

        Collections.sort(tanks, new TankLevelComparator());

        System.out.println("Sorted Tanks:");
        for (WaterTank t : tanks)
            System.out.println(t);
    }
}
