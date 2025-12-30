
public class TrackItemInventory {
    public static void main(String[] args) {
        Item item = new Item(201, "Pen", 10);
        item.displayDetails(3);
    }
}

class Item {
    int itemCode;
    String itemName;
    double price;

    // constructor to initialize item details
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // method to display item and calculate total cost
    public void displayDetails(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Total Cost for " + quantity + " items: " + (price * quantity));
    }
}