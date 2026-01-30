public class CreditCardValidator {

    private static final String CARD_REGEX = "^(4|5)\\d{15}$";

    public static boolean isValidCardNumber(String cardNumber) {
        return cardNumber.matches(CARD_REGEX);
    }

    public static void main(String[] args) {
        System.out.println(isValidCardNumber("4111111111111111"));
        System.out.println(isValidCardNumber("5111111111111111"));
        System.out.println(isValidCardNumber("6111111111111111"));
        System.out.println(isValidCardNumber("41111111"));
    }
}
