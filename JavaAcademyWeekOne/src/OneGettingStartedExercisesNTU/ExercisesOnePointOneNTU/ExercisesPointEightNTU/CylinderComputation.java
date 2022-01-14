package OneGettingStartedExercisesNTU.ExercisesOnePointOneNTU.ExercisesPointEightNTU;
/*
Follow the above example, write a program called CylinderComputation to print the surface area,
base area, and volume of a cylinder, given its radius and height (in doubles).
You should use 5 double variables called radius, height, surfaceArea, baseArea and volume.
Take note that space (blank) is not allowed in variable names.
 */
public class CylinderComputation {
    public static void main(String[] args) {
        double radius, height, surfaceArea, baseArea, volume;
        radius = 10;
        height = 30;
        baseArea = ( Math.PI * (radius * radius));
        surfaceArea = 2 * ( Math.PI * radius * height ) + 2 * baseArea;
        volume = Math.PI * (radius * radius) * height;
        System.out.println("The surface area is: " + surfaceArea);
        System.out.println("The base area is: " + baseArea);
        System.out.println("The volume is: " + volume);


    }
}
