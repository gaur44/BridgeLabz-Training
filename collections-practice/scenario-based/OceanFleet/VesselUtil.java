import java.util.ArrayList;
import java.util.List;

public class VesselUtil {
    private List<Vessel> vesselList = new ArrayList<>();

    public List<Vessel> getVesselList() {
        return vesselList;
    }

    public void setVesselList(List<Vessel> vesselList) {
        this.vesselList = vesselList;
    }

    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }
    
    public Vessel getVesselByID(String vesselID) {
        for (Vessel vessel : vesselList) {
            if (vessel.getVesselID().equals(vesselID)) {
                return vessel;
            }
        }
        return null;
    }

    public List<Vessel> getHighPerformanceVessels() {
        List<Vessel> highPerformers = new ArrayList<>();
        // find max avg speed
        double maxAvgSpeed = 0;
        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() > maxAvgSpeed) {
                maxAvgSpeed = vessel.getAverageSpeed();
            }
        }

        // get all high performers
        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() == maxAvgSpeed) {
                highPerformers.add(vessel);
            }
        }
        return highPerformers;
    }
}