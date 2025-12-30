import java.util.ArrayList;

public class ShoppingCartSim {
    static class CartItem {
        String itemName;
        double price;
        int quantity;

        CartItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }
    }

    // store cart items
    ArrayList<CartItem> cart = new ArrayList<>();

    // method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        cart.add(new CartItem(itemName, price, quantity));
        System.out.println("Added: " + itemName + " " + quantity + "x");
    }

    // method to remove an item from the cart
    public void removeItem(String itemName) {
        cart.removeIf(item -> item.itemName.equalsIgnoreCase(itemName));
        System.out.println("Removed: " + itemName);
    }

    // display total cost of all items
    public void displayTotalCost() {
        double total = 0;
        for (CartItem item : cart) {
            total += item.price * item.quantity;
        }
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        ShoppingCartSim cartSimObj = new ShoppingCartSim();
        cartSimObj.addItem("Laptop", 400, 1);
        cartSimObj.addItem("Book", 10, 5);
        cartSimObj.removeItem("Book");
        cartSimObj.displayTotalCost();
    }
}