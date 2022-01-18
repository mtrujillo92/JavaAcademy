package FourExercisesOnDecisionAndLoop;

public class ComputePIV2 {
    public static void main(String[] args) {
        final int MAX_TERM = 10000000;
        double sum = 0.0;
        double piComputed;
        double comparedPi;
        for (int term = 1; term <= MAX_TERM; term++){
            if (term % 2 == 1)
                sum += 1.0 / ((double) term * 2 - 1);
            else
                sum -= 1.0 / ((double) term * 2 -1);
        }
        piComputed = 4 * sum;
        System.out.println("The sum is: " + piComputed);
        comparedPi = (piComputed / Math.PI)*100;
        System.out.println("The percent of compare Pi is: " + comparedPi);

    }
}
