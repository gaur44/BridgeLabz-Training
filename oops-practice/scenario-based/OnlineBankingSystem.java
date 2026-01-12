class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

interface BankService {
    void deposit(double amt);
    void withdraw(double amt) throws InsufficientBalanceException;
    double getBalance();
}

abstract class Account implements BankService {
    protected String accNo;
    protected String name;
    protected double balance;
    
    public Account(String accNo, String name, double bal) {
        this.accNo = accNo;
        this.name = name;
        this.balance = bal;
    }
    
    public void deposit(double amt) {
        balance += amt;
    }
    
    public void withdraw(double amt) throws InsufficientBalanceException {
        if(balance >= amt) {
            balance -= amt;
        } else {
            throw new InsufficientBalanceException("Insufficient balance");
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public abstract void addInterest();
}

class SavingsAccount extends Account {
    public SavingsAccount(String accNo, String name, double bal) {
        super(accNo, name, bal);
    }
    
    public void addInterest() {
        balance += balance * 0.045; // 4.5% interest
    }
}

class CurrentAccount extends Account {
    private double overdraft = 5000;
    
    public CurrentAccount(String accNo, String name, double bal) {
        super(accNo, name, bal);
    }
    
    public void withdraw(double amt) throws InsufficientBalanceException {
        if(balance + overdraft >= amt) {
            balance -= amt;
        } else {
            throw new InsufficientBalanceException("Overdraft exceeded");
        }
    }
    
    public void addInterest() {
        // no interest
    }
}

class Bank {
    public void transfer(Account from, Account to, double amt) throws InsufficientBalanceException {
        from.withdraw(amt);
        to.deposit(amt);
    }
}

public class OnlineBankingSystem {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("S001", "Rahul", 10000);
        CurrentAccount c1 = new CurrentAccount("C001", "Priya", 5000);
        
        s1.deposit(2000);
        s1.addInterest();
        
        try {
            s1.withdraw(3000);
            
            Bank bank = new Bank();
            bank.transfer(s1, c1, 2000);
            
            System.out.println("Rahul: " + s1.getBalance());
            System.out.println("Priya: " + c1.getBalance());
            
        } catch(InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}