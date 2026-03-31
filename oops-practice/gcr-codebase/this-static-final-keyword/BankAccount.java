public class BankAccount {
    private static String bankName = "Axis Bank";
    private static int totalAccounts = 0;

    private String accountHolderName;
    private final String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    // getter for total accounts
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid Account Instance.");
        }
    }

    // getter - account holder name
    public String getAccountHolderName() {
        return this.accountHolderName;
    }


    // setter - account holder name
    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }


    // getter - balance
    public double getBalance() {
        return balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("Deposited Amount: " + depositAmount);
        } else {
            System.err.println("Invalid Deposit Amount.");
        }
    }

    public void withdraw(double withdrawlAmount) {
        if (withdrawlAmount > 0 && balance >= withdrawlAmount) {
            balance -= withdrawlAmount;
            System.out.println("Withdrew Amount: " + withdrawlAmount);
        } else {
            System.err.println("Invalid Withdrawl Amount.");
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", "12345", 20.50);
        BankAccount account2 = new BankAccount("Bob", "12346", 100);

        System.out.println("Account 1 Details");
        account1.displayAccountDetails();

        System.out.println("Account 2 Details");
        account2.displayAccountDetails();

        BankAccount.getTotalAccounts();

        System.out.println("\nPerforming transactions on Account 1");
        account1.deposit(200);
        account1.withdraw(150);
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        account2.deposit(100);
        account2.withdraw(800);
    }
}