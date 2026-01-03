public class BankAccountManager {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("ABC123", 5000);

        account.deposit(2000);
        account.withdraw(3000);
        account.withdraw(5000); // overdraft attempt
        account.checkBalance();
    }
}

class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            // overdraft
            System.out.println("Insufficient balance. Withdrawal denied.");
        }
    }

    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}
