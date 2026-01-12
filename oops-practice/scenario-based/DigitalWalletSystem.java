class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

interface TransferService {
    void transfer(Wallet from, Wallet to, double amt) throws InsufficientBalanceException;
}

class BankTransfer implements TransferService {
    public void transfer(Wallet from, Wallet to, double amt) throws InsufficientBalanceException {
        from.withdraw(amt);
        to.addMoney(amt);
        System.out.println("Bank transfer done");
    }
}

class WalletTransfer implements TransferService {
    public void transfer(Wallet from, Wallet to, double amt) throws InsufficientBalanceException {
        double fee = amt * 0.01; // 1% fee
        from.withdraw(amt + fee);
        to.addMoney(amt);
        System.out.println("Wallet transfer done");
    }
}

class User {
    private String name;
    private String phone;
    
    public User(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    
    public String getName() {
        return name;
    }
}

class Transaction {
    private String type;
    private double amt;
    
    public Transaction(String type, double amt) {
        this.type = type;
        this.amt = amt;
    }
    
    public void show() {
        System.out.println(type + ": Rs." + amt);
    }
}

class Wallet {
    private User user;
    private double balance;
    private Transaction[] history = new Transaction[10];
    private int count = 0;
    
    public Wallet(User user) {
        this.user = user;
        this.balance = 0;
    }
    
    public void addMoney(double amt) {
        balance += amt;
        history[count++] = new Transaction("Credit", amt);
    }
    
    public void withdraw(double amt) throws InsufficientBalanceException {
        if(balance < amt) {
            throw new InsufficientBalanceException("Low balance");
        }
        balance -= amt;
        history[count++] = new Transaction("Debit", amt);
    }
    
    public void showBalance() {
        System.out.println(user.getName() + ": Rs." + balance);
    }
    
    public void showHistory() {
        System.out.println("\n--- History ---");
        for(int i = 0; i < count; i++) {
            history[i].show();
        }
    }
}

public class DigitalWalletSystem {
    public static void main(String[] args) {
        Wallet w1 = new Wallet(new User("Rohit", "9999999999"));
        Wallet w2 = new Wallet(new User("Rohan", "9999111199"));
        
        w1.addMoney(5000);
        w2.addMoney(3000);
        
        try {
            TransferService bank = new BankTransfer();
            bank.transfer(w1, w2, 1000);
            
            w1.showBalance();
            w2.showBalance();
            
            w1.showHistory();
        } catch(InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}