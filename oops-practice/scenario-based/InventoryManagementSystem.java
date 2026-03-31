class OutOfStockException extends Exception {
    public OutOfStockException(String msg) {
        super(msg);
    }
}

interface AlertService {
    void sendAlert(String msg);
}

class EmailAlert implements AlertService {
    public void sendAlert(String msg) {
        System.out.println("Alert: " + msg);
    }
}

class Product {
    private String id;
    private String name;
    private int stock;
    private int minStock;
    
    public Product(String id, String name, int stock, int minStock) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.minStock = minStock;
    }
    
    public String getId() {
        return id;
    }
    
    public void updateStock(int qty) throws OutOfStockException {
        if(stock + qty < 0) {
            throw new OutOfStockException(name + " out of stock");
        }
        stock += qty;
    }
    
    public boolean isLowStock() {
        return stock <= minStock;
    }
    
    public void display() {
        System.out.println(name + ": " + stock);
    }
}

class Inventory {
    private Product[] products = new Product[10];
    private int count = 0;
    private AlertService alert;
    
    public Inventory(AlertService alert) {
        this.alert = alert;
    }
    
    public void addProduct(Product p) {
        products[count++] = p;
    }
    
    public void updateStock(String id, int qty) throws OutOfStockException {
        for(int i = 0; i < count; i++) {
            if(products[i].getId().equals(id)) {
                products[i].updateStock(qty);
                if(products[i].isLowStock()) {
                    alert.sendAlert("Low stock warning");
                }
                return;
            }
        }
    }
    
    public void showInventory() {
        for(int i = 0; i < count; i++) {
            products[i].display();
        }
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Inventory inv = new Inventory(new EmailAlert());
        
        inv.addProduct(new Product("P1", "Laptop", 10, 5));
        inv.addProduct(new Product("P2", "Mouse", 15, 8));
        
        try {
            inv.updateStock("P1", -6);
            inv.showInventory();
        } catch(OutOfStockException e) {
            System.out.println(e.getMessage());
        }
    }
}