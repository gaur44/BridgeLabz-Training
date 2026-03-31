import java.util.Scanner;

public class SimpleInterest {
    static double simpleInterest(double principal, double rate, double time) {
        double interestAmt = (principal * rate * time) / 100;
        return interestAmt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Interest Calculator");

        // ask for and store required values
        System.out.print("principal: ");
        double principalAmt = sc.nextDouble();
        System.out.print("rate (percent): ");
        double rate = sc.nextDouble();
        System.out.print("time (in years): ");
        double time = sc.nextDouble();

        // calculate interest
        double interestAmt = simpleInterest(principalAmt, rate, time);
        System.out.println("The Simple Interest is " + interestAmt + " for Principal " + principalAmt + ", Rate of Interest " + rate + " and Time " + time);
    }
}
