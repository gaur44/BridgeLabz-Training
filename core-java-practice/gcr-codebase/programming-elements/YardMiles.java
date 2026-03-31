import java.util.Scanner;
public class YardMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        int distance = sc.nextInt();
        double yards = distance / 3;
        double miles = yards / 1760;
        System.out.println("The distance in yards is " + yards + " while the distance in miles is "+ miles);
    }
}
