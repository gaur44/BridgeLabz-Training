import java.time.LocalDate;
import java.util.Scanner;

public class DateComparer {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("enter first date (yyyy-MM-dd): ");
        String input1 = scanner.nextLine();
        LocalDate date1 = LocalDate.parse(input1);
        
        System.out.print("enter second date (yyyy-MM-dd): ");
        String input2 = scanner.nextLine();
        LocalDate date2 = LocalDate.parse(input2);
        
        System.out.println();
        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);
        System.out.println();
        
        if (date1.isBefore(date2)) {
            System.out.println("Date 1 is before Date 2");
        } else if (date1.isAfter(date2)) {
            System.out.println("Date 1 is after Date 2");
        } else if (date1.isEqual(date2)) {
            System.out.println("Date 1 is the same as Date 2");
        }
        
        scanner.close();
    }
}

