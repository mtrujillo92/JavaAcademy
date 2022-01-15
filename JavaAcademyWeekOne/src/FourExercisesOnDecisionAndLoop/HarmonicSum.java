package FourExercisesOnDecisionAndLoop;

public class HarmonicSum {
    public static void main(String[] args) {
        final int MAX_DENOMINATOR = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator++)
            sumL2R += 1 / (double)denominator;

        for (int denominator = MAX_DENOMINATOR; denominator >= 1; denominator--)
            sumR2L += 1 / (double)denominator;
        System.out.println("The sum from left-to-right is: " + sumL2R);
        System.out.println("The sum from right-to-left is: " + sumR2L);
        absDiff = (sumL2R > sumR2L) ? sumL2R - sumR2L : sumR2L - sumL2R;
        System.out.println("The absolute difference between them is: " + absDiff);
    }
}
