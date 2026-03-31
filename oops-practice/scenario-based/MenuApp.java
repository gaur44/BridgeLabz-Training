import java.util.Scanner;

public class MenuApp {

    static void show(String[] a) {
        // print menu
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " - " + a[i]);
        }
    }

    static String get(String[] a, int n) {
        // check number
        if (n >= 0 && n < a.length)
            return a[n];
        else
            return "Wrong number";
    }

    public static void main(String[] args) {

        String[] arr = {
            "Sandwich", "Burger", "Pasta", "Rice", "Pizza",
            "Fries", "Noodles", "Coffee", "Tea", "Ice cream"
        };

        Scanner s = new Scanner(System.in);

        show(arr);

        System.out.print("Pick item no: ");
        int x = s.nextInt();

        String ans = get(arr, x);

        System.out.println("You got: " + ans);
        s.close();
    }
}
