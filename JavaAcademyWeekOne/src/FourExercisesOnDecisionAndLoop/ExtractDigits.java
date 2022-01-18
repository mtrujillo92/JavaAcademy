package FourExercisesOnDecisionAndLoop;

public class ExtractDigits {
    public static void main(String[] args) {
        int n = 15423;
        System.out.print("The reverse of " + n + " is ");
        while (n > 0){
            int digit = n % 10;
            System.out.print(digit + " ");
            n = n / 10;
        }
    }
}
