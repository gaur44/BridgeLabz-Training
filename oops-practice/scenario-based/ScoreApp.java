import java.util.Scanner;

class InvalidScoreException extends Exception {
    InvalidScoreException(String msg) {
        super(msg);
    }
}

public class ScoreApp {
    static double avg(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        return (double) sum / a.length;
    }

    static int max(int[] a) {
        int m = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > m)
                m = a[i];
        return m;
    }

    static int min(int[] a) {
        int m = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] < m)
                m = a[i];
        return m;
    }

    static void check(int[] a) throws InvalidScoreException {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0 || a[i] > 100)
                throw new InvalidScoreException("Score wrong: " + a[i]);
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("How many students: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        // input score
        System.out.println("Enter scores:");
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        try {
            check(arr);

            System.out.println("Avg: " + avg(arr));
            System.out.println("High: " + max(arr));
            System.out.println("Low: " + min(arr));

        } catch (InvalidScoreException e) {
            System.out.println("Error: " + e.getMessage());
        }
        s.close();
    }
}
