import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalFineAmount = 0;
        
        System.out.println("Library Fine Calculator");
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nBook " + i);
            
            System.out.print("Enter due date (YYYY-MM-DD): ");
            String dueDateString = sc.next();
            LocalDate dueDate = LocalDate.parse(dueDateString);
            
            System.out.print("Enter return date (YYYY-MM-DD): ");
            String returnDateString = sc.next();
            LocalDate returnDate = LocalDate.parse(returnDateString);
            
            long lateDays = ChronoUnit.DAYS.between(dueDate, returnDate);
            
            if (lateDays > 0) {
                int fine = (int) lateDays * 5;
                totalFineAmount += fine;
                System.out.println("Late by " + lateDays + " days. Fine: Rs." + fine);
            } else {
                System.out.println("Returned on time. No fine.");
            }
        }
        
        System.out.println();
        System.out.println("Total Fine: Rs." + totalFineAmount);
        sc.close();
    }
}