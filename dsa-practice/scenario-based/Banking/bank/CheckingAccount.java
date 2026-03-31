package bank;

class CheckingAccount extends BankAccount {

    CheckingAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    double calculateFee() {
        return getBalance() < 1000 ? 1.0 : 0.0;
    }
}

