import java.util.Scanner;

public class DiscountedAmountWithInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int fee;
        fee = sc.nextInt();
        int discountPercent;
        discountPercent = sc.nextInt();
        int discount = (fee*discountPercent)/100;
        int discountedAmount = fee - discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discountedAmount);
    }
}
