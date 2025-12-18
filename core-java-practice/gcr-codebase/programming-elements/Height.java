import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        double inchHeight = height * 2.54;
        double footHeight = inchHeight/12;
        System.out.print("Your Height in cm is " + height + " while in feet is " + footHeight + " and inches is " + inchHeight);
    }
}
