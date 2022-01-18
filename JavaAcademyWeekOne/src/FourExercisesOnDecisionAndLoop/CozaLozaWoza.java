package FourExercisesOnDecisionAndLoop;

public class CozaLozaWoza {
    public static void main(String[] args) {
        final int LOWERBOUND = 1, UPPERBOUND = 110;
        boolean printed;
        for(int number = LOWERBOUND; number <= UPPERBOUND; number++){
            printed = false;
            if (number % 3 == 0) {
                System.out.print("Coza");
                printed = true;
            }
            if (number % 5 == 0) {
                System.out.print("Loza");
                printed = true;
            }
            if (number % 7 == 0) {
                System.out.print("Woza");
                printed = true;
            }
            if (!printed)
                System.out.print(number);
            if (number % 11 == 0)
                System.out.print("\n");
            else
                System.out.print(" ");
        }

    }
}
