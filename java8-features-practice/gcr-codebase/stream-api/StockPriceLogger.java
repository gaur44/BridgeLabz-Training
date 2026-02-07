import java.util.*;

public class StockPriceLogger {
    public static void main(String[] args) {

        List<Double> stockPrices = Arrays.asList(
            245.5, 247.8, 246.2, 249.0
        );

        stockPrices.stream()
                   .forEach(price -> System.out.println("Price: " + price));
    }
}
