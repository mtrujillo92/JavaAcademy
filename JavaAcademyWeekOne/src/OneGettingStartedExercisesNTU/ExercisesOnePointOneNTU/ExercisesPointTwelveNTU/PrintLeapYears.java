package OneGettingStartedExercisesNTU.ExercisesOnePointOneNTU.ExercisesPointTwelveNTU;
/*
Write a program called PrintLeapYears to print all the leap years between AD999 and AD2010. Also print the total number of leap years.
(Hints: use a int variable called count, which is initialized to zero. Increment the count whenever a leap year is found.)
 */
public class PrintLeapYears {
    public static void main(String[] args) {
        final int LOWERYEAR = 999;
        final int UPPERYEAR = 2010;
        int count = 0;
        int year = LOWERYEAR;
        while (year <= UPPERYEAR){
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
                count++;
            }
            year++;
        }
        System.out.println("The sum of all the leap years from " + LOWERYEAR + " to " + UPPERYEAR + " is: " + count);
    }
}
