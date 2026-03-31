package bank;

abstract class BankAccount {

    private final String accountNumber;
    private final double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    abstract double calculateFee();
}

