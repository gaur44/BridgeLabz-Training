import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {
        Random randomNum = new Random();
        int numberToGuess = randomNum.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int guessedNum;
        do {
            System.out.print("guess the number (1-100): ");
            guessedNum = sc.nextInt();
            if (guessedNum < numberToGuess) System.out.println("guess is too low");
            else if (guessedNum > numberToGuess) System.out.println("guess is too high");
            else System.out.println("Correct!");
        } while (guessedNum != numberToGuess);
        sc.close();
    }
}