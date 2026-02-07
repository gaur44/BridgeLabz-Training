import java.util.*;

public class TransformNames {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
            "Rohan", "Harsh", "Mukul", "Agraj"
        );

        names.stream()
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
    }
}
