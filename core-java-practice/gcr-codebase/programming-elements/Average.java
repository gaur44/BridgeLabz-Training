import java.util.Scanner;

public class Average{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("enter number 2: ");
        int num2 = sc.nextInt();
        System.out.print("enter number 3:");
        int num3 = sc.nextInt();

        double avg = (num1+num2+num3)/3;
        System.out.print("average: " + avg);
    }
}
