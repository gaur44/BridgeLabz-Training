public class WaterTank {
    private String id;
    private double capacity;
    private double currentLevel;

    public WaterTank(String id, double capacity, double currentLevel) throws InvalidWaterLevelException {
        if (currentLevel > capacity)
            throw new InvalidWaterLevelException("Level exceeds capacity for tank " + id);

        this.id = id;
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    public double getCurrentLevel() {
        return currentLevel;
    }

    public String getId() {
        return id;
    }

    public double usagePercent() {
        return (currentLevel / capacity) * 100;
    }

    public void checkAlert() {
        if (usagePercent() < 20)
            System.out.println("Alert: Tank " + id + " below 20%");
    }

    @Override
    public String toString() {
        return id + " Level=" + currentLevel;
    }
}
