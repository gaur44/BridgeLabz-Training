interface PaymentProcessor {

    void pay();

    default void refund() {
        System.out.println("Refund processed using default flow");
    }
}
