class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) {
        super(msg);
    }
}

interface Payment {
    void processPayment(double amt) throws PaymentFailedException;
}

class CardPayment implements Payment {
    private String cardNo;
    
    public CardPayment(String cardNo) {
        this.cardNo = cardNo;
    }
    
    public void processPayment(double amt) throws PaymentFailedException {
        if(amt > 50000) {
            throw new PaymentFailedException("Card limit exceeded");
        }
        System.out.println("Paid " + amt + " via Card");
    }
}

class UPIPayment implements Payment {
    private String upiId;
    
    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }
    
    public void processPayment(double amt) throws PaymentFailedException {
        if(amt > 100000) {
            throw new PaymentFailedException("UPI limit exceeded");
        }
        System.out.println("Paid " + amt + " via UPI");
    }
}

class WalletPayment implements Payment {
    private double balance;
    
    public WalletPayment(double balance) {
        this.balance = balance;
    }
    
    public void processPayment(double amt) throws PaymentFailedException {
        if(balance < amt) {
            throw new PaymentFailedException("Insufficient wallet balance");
        }
        balance -= amt;
        System.out.println("Paid " + amt + " via Wallet");
    }
}

class Product {
    private String id;
    private String name;
    private double price;
    
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
}

class Customer {
    private String name;
    private String email;
    
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
}

class Order {
    private String orderId;
    private Customer customer;
    private Product product;
    private int quantity;
    private String status;
    
    public Order(String orderId, Customer customer, Product product, int qty) {
        this.orderId = orderId;
        this.customer = customer;
        this.product = product;
        this.quantity = qty;
        this.status = "Pending";
    }
    
    public double getTotalAmount() {
        return product.getPrice() * quantity;
    }
    
    public void placeOrder(Payment payment) throws PaymentFailedException {
        double total = getTotalAmount();
        payment.processPayment(total);
        status = "Confirmed";
        System.out.println("Order placed for " + customer.getName());
    }
    
    public void cancelOrder() {
        if(status.equals("Confirmed")) {
            status = "Cancelled";
            System.out.println("Order cancelled");
        } else {
            System.out.println("Cannot cancel order");
        }
    }
    
    public void trackOrder() {
        System.out.println("Order Status: " + status);
    }
}

public class ECommerceSystem {
    public static void main(String[] args) {
        Product p1 = new Product("P001", "Laptop", 45000);
        Product p2 = new Product("P002", "Phone", 25000);
        
        Customer c1 = new Customer("Amit", "amit@email.com");
        
        Order order1 = new Order("O001", c1, p1, 1);
        Order order2 = new Order("O002", c1, p2, 2);
        
        try {
            // different payment methods
            Payment cardPay = new CardPayment("1234-5678");
            order1.placeOrder(cardPay);
            order1.trackOrder();
            
            Payment upiPay = new UPIPayment("amit@upi");
            order2.placeOrder(upiPay);
            
            order1.cancelOrder();
            order1.trackOrder();
            
        } catch(PaymentFailedException e) {
            System.out.println("Payment failed: " + e.getMessage());
        }
    }
}