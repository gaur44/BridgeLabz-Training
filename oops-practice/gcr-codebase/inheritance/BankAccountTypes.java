public class BankAccountTypes {
    public static void main(String[] args) {
        BankAccount b1 = new SavingsAccount("SA001", 50000, 4.5);
        BankAccount b2 = new CheckingAccount("CA001", 20000, 10000);
        BankAccount b3 = new FixedDepositAccount("FD001", 100000, 24, 7);

        b1.displayAccountType();
        b2.displayAccountType();
        b3.displayAccountType();
    }
}

class BankAccount {
    final String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Bank Account");
    }

}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

}

class FixedDepositAccount extends BankAccount {
    double duration;
    double rate;

    public FixedDepositAccount(String accountNumber, double balance, double duration, double rate) {
        super(accountNumber, balance);
        this.duration = duration;
        this.rate = rate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}