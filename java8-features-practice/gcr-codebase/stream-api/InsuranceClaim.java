import java.util.*;
import java.util.stream.*;

class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

public class InsuranceClaim {
    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
            new Claim("Health", 5000),
            new Claim("Vehicle", 12000),
            new Claim("Health", 8000),
            new Claim("Property", 20000),
            new Claim("Vehicle", 15000)
        );

        Map<String, Double> avgClaimByType =
            claims.stream()
                  .collect(Collectors.groupingBy(
                      c -> c.type,
                      Collectors.averagingDouble(c -> c.amount)
                  ));

        avgClaimByType.forEach(
            (type, avg) -> System.out.println(type + " : " + avg)
        );
    }
}
