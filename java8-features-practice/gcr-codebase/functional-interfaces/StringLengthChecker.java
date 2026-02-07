import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {

        int limit = 10;

        Function<String, Integer> lengthFunction =
                msg -> msg.length();

        String message = "Hello World";

        if (lengthFunction.apply(message) > limit) {
            System.out.println("Message exceeds character limit");
        } else {
            System.out.println("Message is within limit");
        }
    }
}

