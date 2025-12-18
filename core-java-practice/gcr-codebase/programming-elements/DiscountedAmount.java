import java.util.Scanner;

public class DiscountedAmount {
    public static void main(String[] args){
        int fee = 125000;
        int discount = (fee*10)/100;
        int discountedAmount = fee - discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+discountedAmount);
    }
}
