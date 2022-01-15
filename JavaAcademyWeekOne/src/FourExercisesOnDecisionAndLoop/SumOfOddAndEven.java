package FourExercisesOnDecisionAndLoop;

public class SumOfOddAndEven {
    public static void main(String[] args) {
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;
        for (int number = 1; number <= 100; number++){
            if (number % 2 == 0)
                sumEven += number;
            else
                sumOdd += number;
        }
        absDiff = (sumOdd > sumEven) ? sumOdd-sumEven : sumEven - sumOdd;
        System.out.println("The sum of even numbers is: " + sumEven);
        System.out.println("The sum of odd numbers is: " + sumOdd);
        System.out.println("The absolute difference is: " + absDiff);
    }
}
