import java.util.*;

public class Cards {
    static String[] initDeck() {
        String[] s = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] r = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        String[] d = new String[s.length * r.length];
        int k = 0;
        for (String x : s)
            for (String y : r)
                d[k++] = y + " of " + x;
        return d;
    }

    static void shuffle(String[] d) {
        for (int i = 0; i < d.length; i++) {
            int r = i + (int) (Math.random() * (d.length - i));
            String t = d[i];
            d[i] = d[r];
            d[r] = t;
        }
    }

    static String[][] deal(String[] d, int p, int n) {
        String[][] a = new String[p][n];
        int k = 0;
        for (int i = 0; i < p; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = d[k++];
        return a;
    }

    static void print(String[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
                if (j < a[i].length - 1)
                    System.out.print(", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt(), n = sc.nextInt();
        String[] d = initDeck();
        shuffle(d);
        String[][] a = deal(d, p, n);
        print(a);
    }
}