import java.util.Scanner;

public class BusTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalDistance = 0;
        int stopNumber = 1;
        
        System.out.println("Bus Route Distance Tracker");
        
        while (true) {
            System.out.println();
            System.out.println("Stop " + stopNumber);
            System.out.print("Enter distance to next stop (in km): ");
            int distance = sc.nextInt();
            
            totalDistance = totalDistance + distance;
            
            System.out.println("Total distance covered so far: " + totalDistance + " km");
            
            System.out.print("Do you want to get off at this stop? (yes/no): ");
            String choice = sc.next();
            
            if (choice.equals("yes")) {
                System.out.println("\nThank you for traveling with us!");
                System.out.println("Total journey distance: " + totalDistance + " km");
                break;
            }
            
            stopNumber++;
        }
        
        sc.close();
    }
}
