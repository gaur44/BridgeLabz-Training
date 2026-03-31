package bank;

class SavingsAccount extends BankAccount {

    SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    double calculateFee() {
        return getBalance() * 0.005;
    }
}

