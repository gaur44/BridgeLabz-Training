import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("principle amount: ");
        int principle = sc.nextInt();

        System.out.print("time duration: ");
        int time = sc.nextInt();

        System.out.print("rate: ");
        int rate = sc.nextInt();

        double simpleInterest = (principle*time*rate)/100;
        System.out.print("result: " + simpleInterest);
    }
}
