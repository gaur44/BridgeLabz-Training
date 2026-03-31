import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] options = {"rock", "paper", "scissors"};
        int userWins = 0, computerWins = 0;

        System.out.print("enter number of games: ");
        int games = scanner.nextInt();

        for (int i = 0; i < games; i++) {
            System.out.print("enter your choice (rock/paper/scissors): ");
            String user = scanner.next().toLowerCase();
            String comp = options[(int)(Math.random() * 3)];

            System.out.println("Computer chose: " + comp);

            if (user.equals(comp)) {
                System.out.println("Draw");
            } else if ((user.equals("rock") && comp.equals("scissors")) ||
                       (user.equals("paper") && comp.equals("rock")) ||
                       (user.equals("scissors") && comp.equals("paper"))) {
                userWins++;
                System.out.println("You win!");
            } else {
                computerWins++;
                System.out.println("Computer wins!");
            }
        }

        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.printf("User Win %%: %.2f%%\n", (userWins * 100.0 / games));
        System.out.printf("Computer Win %%: %.2f%%\n", (computerWins * 100.0 / games));

        scanner.close();
    }
}
