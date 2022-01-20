package FiveExercisesOnInputDecisionLoop;

import java.util.Scanner;

/*
For example, suppose that the taxable income is $85000, the income tax payable
is $20000*0% + $20000*10% + $20000*20% + $25000*30%.

Write a program called IncomeTaxCalculator that reads the taxable income (in int).
The program shall calculate the income tax payable (in double); and print the result
rounded to 2 decimal places.

Suppose that a 10% tax rebate is announced for the income tax payable, capped at $1,000,
modify your program to handle the tax rebate. For example, suppose that the tax payable is $12,000,
the rebate is $1,000, as 10% of $12,000 exceed the cap.
 */
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;

        int taxableIncome;
        double taxPayable, taxRebate;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the taxable income: $");
        taxableIncome = in.nextInt();

        if (taxableIncome <= 20000)
            taxPayable = 0.0;
        else if (taxableIncome <= 40000)
            taxPayable = ((double)taxableIncome - 20000) * TAX_RATE_ABOVE_20K;
        else if (taxableIncome <= 60000)
            taxPayable = ((double)taxableIncome - 40000) * TAX_RATE_ABOVE_40K + (20000 * TAX_RATE_ABOVE_20K);
        else
            taxPayable = ((double)taxableIncome - 60000) * TAX_RATE_ABOVE_60K + (20000 * TAX_RATE_ABOVE_40K) + (20000 * TAX_RATE_ABOVE_20K);
        System.out.printf("The income tax payable is: $%.2f%n",taxPayable);

        if(taxPayable == 0)
            taxRebate = 0;
        else if (taxPayable * 0.1 <= 1000)
            taxRebate = taxPayable * 0.1;
        else
            taxRebate = 1000;
        taxPayable = taxPayable - taxRebate;
        System.out.printf("The tax rebate is: $%.2f%n",taxRebate);
        System.out.printf("The total tax is: $%.2f",taxPayable);

    }
}
