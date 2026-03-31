public class PaymentGatewayApp {
    public static void main(String[] args) {

        PaymentProcessor upi = new UpiProcessor();
        PaymentProcessor card = new CardProcessor();

        upi.pay();
        upi.refund();

        card.pay();
        card.refund();
    }
}
