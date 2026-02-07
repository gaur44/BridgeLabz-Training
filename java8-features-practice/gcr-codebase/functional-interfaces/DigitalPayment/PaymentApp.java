public class PaymentApp {
    public static void main(String[] args) {

        Payment upi = new UPI();
        Payment card = new CreditCard();
        Payment wallet = new Wallet();

        upi.pay();
        card.pay();
        wallet.pay();
    }
}

