import java.util.Scanner;

public class ElectionBooth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;
        int totalVoters = 0;
        
        System.out.println("Candidates:");
        System.out.println("1. Candidate A");
        System.out.println("2. Candidate B");
        System.out.println("3. Candidate C");
        System.out.println("(Enter 0 to exit and show results)");
        System.out.println();
        
        while (true) {
            System.out.print("Enter voter's age (or 0 to exit): ");
            int age = sc.nextInt();
            
            if (age == 0) {
                break;
            }
            
            if (age >= 18) {
                System.out.println("Eligible to vote!");
                System.out.print("Cast your vote (1/2/3): ");
                int vote = sc.nextInt();
                
                if (vote == 1) {
                    candidate1Votes++;
                    totalVoters++;
                    System.out.println("Vote recorded for Candidate A");
                } else if (vote == 2) {
                    candidate2Votes++;
                    totalVoters++;
                    System.out.println("Vote recorded for Candidate B");
                } else if (vote == 3) {
                    candidate3Votes++;
                    totalVoters++;
                    System.out.println("Vote recorded for Candidate C");
                } else {
                    System.out.println("Invalid vote!");
                }
            } else {
                System.out.println("You must be 18 or older to vote.");
            }
            
            System.out.println();
        }
        
        System.out.println("\nResults:");
        System.out.println("Total Voters: " + totalVoters);
        System.out.println("Candidate A: " + candidate1Votes + " votes");
        System.out.println("Candidate B: " + candidate2Votes + " votes");
        System.out.println("Candidate C: " + candidate3Votes + " votes");
        
        sc.close();
    }
}
