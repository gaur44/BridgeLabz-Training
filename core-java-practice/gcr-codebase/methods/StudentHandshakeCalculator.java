import java.util.Scanner;

public class StudentHandshakeCalculator {
    public static int calculateHandshakes(int n) {
        int numHandshakes = (n * (n - 1)) / 2;
        return numHandshakes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of students: ");
        int n = sc.nextInt();
        System.out.println("maximum possible handshakes: " + calculateHandshakes(n));
        sc.close();
    }
}