public class SimulateATM {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Rohan", "1234567890", 10000);
        account.depositMoney(9000);
        account.withdrawMoney(3000);
        account.displayBalance();
    }
}

class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    // initialize account details
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // deposit money into account
    public void depositMoney(double amount) {
        balance += amount;
    }

    public void withdrawMoney(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

}
