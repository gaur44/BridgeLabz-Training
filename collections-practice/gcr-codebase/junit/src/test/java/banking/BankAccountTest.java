package banking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount(100);
        account.withdraw(30);
        assertEquals(70, account.getBalance());
    }

    @Test
    public void testInsufficientFunds() {
        BankAccount account = new BankAccount(50);
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(100);
        });
    }

    @Test
    public void testMultipleTransactions() {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        account.withdraw(30);
        account.deposit(20);
        assertEquals(140, account.getBalance());
    }
}