package OneGettingStartedExercisesNTU.ExercisesOnePointTwoNTU;
/*
Write a program called CheckPassFail which prints "PASS" if the int variable "mark" is more than or equal to 50;
or prints "FAIL" otherwise. The program shall always print “DONE” before exiting.
 */

public class CheckPassFail {
    public static void main(String[] args) {
        int mark=51;
        System.out.println("The mark is " + mark);
        if (mark >= 50)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
        System.out.println("DONE");
    }
}
