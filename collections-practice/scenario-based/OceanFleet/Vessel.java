public class Vessel {
    private String vesselID;
    private String vesselName;
    private double averageSpeed;
    private String vesselType;

    public String getVesselID() {
        return vesselID;
    }

    public void setVesselID(String vesselID) {
        this.vesselID = vesselID;
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public String getVesselType() {
        return vesselType;
    }

    public void setVesselType(String vesselType) {
        this.vesselType = vesselType;
    }

    public Vessel(String vesselID, String vesselName, double averageSpeed, String vesselType) {
        this.vesselID = vesselID;
        this.vesselName = vesselName;
        this.averageSpeed = averageSpeed;
        this.vesselType = vesselType;
    }

    public String toString() {
        return this.getVesselID() + " | " + this.getVesselName() + " | " + this.getVesselType()
                    + " | " + this.getAverageSpeed() + " knots";
    }
}
