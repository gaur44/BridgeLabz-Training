class CardProcessor implements PaymentProcessor {

    public void pay() {
        System.out.println("Card payment processed");
    }

    public void refund() {
        System.out.println("Card refund processed");
    }
}
