package bank;

public class Main {
    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount("12345", 1000.0);
        System.out.printf("%.2f%n", savings.calculateFee());

        BankAccount s2 = new SavingsAccount("11111", 500.0);
        System.out.printf("%.2f%n", s2.calculateFee());

        BankAccount c1 = new CheckingAccount("22222", 1500.0);
        System.out.printf("%.2f%n", c1.calculateFee());

        BankAccount c2 = new CheckingAccount("33333", 500.0);
        System.out.printf("%.2f%n", c2.calculateFee());
    }
}

