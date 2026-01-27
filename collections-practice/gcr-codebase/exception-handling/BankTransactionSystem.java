import java.util.Scanner;

// Custom checked exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException() {
        super();
    }
}

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }

        if (amount > balance) {
            throw new InsufficientBalanceException();
        }

        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

public class BankTransactionSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(5000);

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");

        } finally {
            sc.close();
        }
    }
}

