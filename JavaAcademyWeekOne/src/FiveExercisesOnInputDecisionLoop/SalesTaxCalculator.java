package FiveExercisesOnInputDecisionLoop;

import java.util.Scanner;

public class SalesTaxCalculator {
    public static void main(String[] args) {
        final double SALES_TAX_RATE = 0.07;
        final int SENTINEL = -1;
        double price, actualPrice, salesTax;
        double totalPrice = 0.0, totalActualPrice = 0.0, totalSalesTax = 0.0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
        price = in.nextDouble();

        while (price != SENTINEL){
            actualPrice = price / (1 + SALES_TAX_RATE);
            salesTax = price - actualPrice;

            totalPrice += price;
            totalSalesTax += salesTax;
            totalActualPrice += actualPrice;

            System.out.printf("Actual price is: $%.2f",actualPrice);
            System.out.printf(", Sales Tax is: $%.2f%n",salesTax);

            System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
            price = in.nextDouble();
        }
        in.close();
        System.out.printf("Total Price is: $%.2f%n",totalPrice);
        System.out.printf("Total Actual Price is: $%.2f%n",totalActualPrice);
        System.out.printf("Total Sales Tax is: $%.2f%n",totalSalesTax);
    }
}
