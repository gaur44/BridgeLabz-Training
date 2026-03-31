import java.util.Comparator;

public class TankLevelComparator implements Comparator<WaterTank> {
    public int compare(WaterTank a, WaterTank b) {
        return Double.compare(a.getCurrentLevel(), b.getCurrentLevel());
    }
}
