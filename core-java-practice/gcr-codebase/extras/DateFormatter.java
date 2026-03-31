import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    
    public static void main(String[] args) {
        LocalDate curDate = LocalDate.now();
        
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        
        System.out.println("Current date in different formats:\n");
        System.out.println("dd/MM/yyyy format: " + curDate.format(f1));
        System.out.println("yyyy-MM-dd format: " + curDate.format(f2));
        System.out.println("EEE, MMM dd, yyyy format: " + curDate.format(f3));
    }
}

