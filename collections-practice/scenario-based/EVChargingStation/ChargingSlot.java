public class ChargingSlot {
    private int id;
    private boolean occupied;

    public ChargingSlot(int id) {
        this.id = id;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void occupy() {
        occupied = true;
    }

    public void free() {
        occupied = false;
    }

    public int getId() {
        return id;
    }
}
