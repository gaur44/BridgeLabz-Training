import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it. Enter: ");
        System.out.println("- 'high' if my guess is too high");
        System.out.println("- 'low' if my guess is too low");
        System.out.println("- 'correct' if I guessed right\n");
        
        int minInt = 1;
        int maxInt = 100;
        int attempts = 0;
        
        while (true) {
            int guess = guess(minInt, maxInt);
            attempts++;
            
            System.out.println("My guess: " + guess);
            System.out.print("Your feedback (high/low/correct): ");
            String feedback = sc.nextLine().toLowerCase();
            
            if (feedback.equals("correct")) {
                System.out.println("Guessed in " + attempts + " attempt(s).");
                break;
            } else if (feedback.equals("high")) {
                maxInt = guess - 1;
            } else if (feedback.equals("low")) {
                minInt = guess + 1;
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
                attempts--;
                continue;
            }
            
            if (minInt > maxInt) {
                System.out.println("Something went wrong. Please restart the game.");
                break;
            }
        }
        
        sc.close();
    }
    
    // method to generate random guess
    public static int guess(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}

