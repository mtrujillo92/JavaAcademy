package OneGettingStartedExercisesNTU.ExercisesOnePointOneNTU.ExercisesPointEightNTU;
/*
Follow the above example, write a program called RectangleComputation to print the area and
perimeter of a rectangle, given its length and width (in doubles). You should use 4 double
variables called length, width, area and perimeter.
 */
public class RectangleComputation {
    public static void main(String[] args) {
        double length, width, area, perimeter;
        length=3.6;
        width=9.1;
        area = length * width;
        perimeter = 2 * (length + width);
        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);
    }
}
