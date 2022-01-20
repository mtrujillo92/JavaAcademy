package FiveExercisesOnInputDecisionLoop;
/*
Based on the previous exercise, write a program called IncomeTaxCalculatorWithSentinel which shall repeat the
calculation until user enter -1.
 */
import java.util.Scanner;

public class IncomeTaxCalculatorWithSentinel {
    public static void main(String[] args) {
        final int SENTINEL = -1;
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;

        int taxableIncome;
        double taxPayable;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the taxable income (or -1 to end): $");
        taxableIncome = in.nextInt();

        while(taxableIncome != SENTINEL) {
            if (taxableIncome <= 20000)
                taxPayable = 0.0;
            else if (taxableIncome <= 40000)
                taxPayable = ((double) taxableIncome - 20000) * TAX_RATE_ABOVE_20K;
            else if (taxableIncome <= 60000)
                taxPayable = ((double) taxableIncome - 40000) * TAX_RATE_ABOVE_40K + (20000 * TAX_RATE_ABOVE_20K);
            else
                taxPayable = ((double) taxableIncome - 60000) * TAX_RATE_ABOVE_60K + (20000 * TAX_RATE_ABOVE_40K) + (20000 * TAX_RATE_ABOVE_20K);
            System.out.printf("The income tax payable is: $%.2f%n", taxPayable);

            System.out.print("Enter the taxable income (or -1 to end): $");
            taxableIncome = in.nextInt();
        }
        System.out.println("bye!");
    }
}
