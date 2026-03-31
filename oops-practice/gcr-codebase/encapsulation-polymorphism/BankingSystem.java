public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[2];

        accounts[0] = (new SavingsAccount("SA101", "Alice", 50000));
        accounts[1] = (new CurrentAccount("CA202", "Bob", 80000));

        for (BankAccount acc : accounts) {

            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Account Number: " + acc.getAccountNumber());

            double interest = acc.calculateInterest();
            System.out.println("Interest: " + interest);

            if (acc instanceof Loanable) {
                Loanable l = (Loanable) acc;
                System.out.println("Loan Eligibility: " + l.calculateLoanEligibility());
            }

            System.out.println();
        }
    }
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // concrete methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // abstract method
    public abstract double calculateInterest();

    // getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    protected double getBalance() {
        return balance;
    }
}

interface Loanable {
    void applyForLoan(double amount);

    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        // 4% interest rate
        return getBalance() * 0.04;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan application of " + amount + " submitted.");
    }

    @Override
    public double calculateLoanEligibility() {
        // can get loan up to 50% of balance
        return getBalance() * 0.5;
    }
}

class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        // 2% interest
        return getBalance() * 0.02;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan application of " + amount + " submitted.");
    }

    @Override
    public double calculateLoanEligibility() {
        // can get loan up to 70% of balance
        return getBalance() * 0.7;
    }
}
