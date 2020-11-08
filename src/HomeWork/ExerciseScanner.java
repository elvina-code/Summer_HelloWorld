package HomeWork;
import java.util.Scanner;//The Scanner class is part of the standard Java class library and makes elementary input/output

public class ExerciseScanner {
    public static void main(String [] args){
        int miles;
        double gallons;
        double mpg;
        Scanner road = new Scanner(System.in); //This creates a new object called ‘scan’ and tells the object that the input will be coming from the system standard input stream (defaults to keyboard).
        // Scanner objects allow us to input data either interactively (from the keyboard) or from a data file.
        System.out.println("Enter miles:");
        miles = road.nextInt(); // Scanner Object Methods :String nextLine() or int  nextInt()
        System.out.println("Enter gallons");
        gallons = road.nextDouble();
        mpg = miles/gallons;
        System.out.println("Result miles per gallon: " + mpg);

    }// end main
}// end class
