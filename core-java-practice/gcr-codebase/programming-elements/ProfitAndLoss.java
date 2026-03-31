import java.util.Scanner;
public class ProfitAndLoss {
    public static void main(String[] args){
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercentage = ( (double) profit/costPrice) * 100;
        System.out.println("The Cost Price is INR "+ costPrice +" and the Selling Price is INR "+sellingPrice+"The Profit is INR "+profit+" and the Profit Percentage is "+profitPercentage);
    }
}
