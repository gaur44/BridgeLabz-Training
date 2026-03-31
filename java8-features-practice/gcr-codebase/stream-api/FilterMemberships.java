import java.time.LocalDate;
import java.util.*;

class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
}

public class FilterMemberships {
    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
            new Member("A", LocalDate.now().plusDays(10)),
            new Member("B", LocalDate.now().plusDays(40)),
            new Member("C", LocalDate.now().plusDays(25))
        );

        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        members.stream()
               .filter(m -> !m.expiryDate.isBefore(today)
                         && m.expiryDate.isBefore(limit))
               .forEach(m -> System.out.println(m.name));
    }
}
