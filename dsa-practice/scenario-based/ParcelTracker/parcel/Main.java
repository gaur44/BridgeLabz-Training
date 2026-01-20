package parcel;

public class Main {
    public static void main(String[] args) {

        ParcelChain parcel = new ParcelChain();

        parcel.addStage("Packed");
        parcel.addStage("Shipped");
        parcel.addStage("In Transit");
        parcel.addStage("Delivered");

        parcel.addAfter("Shipped", "Warehouse Check");

        parcel.track();
    }
}
