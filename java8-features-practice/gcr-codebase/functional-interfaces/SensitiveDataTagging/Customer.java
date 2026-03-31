class Customer implements SensitiveData {
    String name;
    String accountNumber;

    Customer(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }
}
