import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        System.out.print("Enter date (yyyy-mm-dd): ");
        String input = sc.nextLine();
        LocalDate date = LocalDate.parse(input);
        
        System.out.println("\nOriginal Date: " + date);
        
        // add 7 days
        date = date.plusDays(7);
        System.out.println("After adding 7 days: " + date);
        
        // add 1 month
        date = date.plusMonths(1);
        System.out.println("After adding 1 month: " + date);
        
        // add 2 years
        date = date.plusYears(2);
        System.out.println("After adding 2 years: " + date);
        
        // subtract 3 weeks
        date = date.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + date);
        System.out.println();
        System.out.println("Final Date: " + date);
        
        sc.close();
    }
}