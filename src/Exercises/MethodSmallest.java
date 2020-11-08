package Exercises;


import java.util.Scanner;

public class MethodSmallest {

    public static void main(String[] args) {
        // Write your code here
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter first number:");
        double a = userInput.nextDouble();
        System.out.println("Enter second number:");
        double b = userInput.nextDouble();
        System.out.println("Enter third number:");
        double c = userInput.nextDouble();
        System.out.println("smallest " + smallNumber(a,b,c));
        System.out.println("average " + averageNumber(a,b,c));
    }
    public static double smallNumber(double y, double v, double z ){

        return Math.min(Math.min( y, v), z);
    }

    public static double averageNumber(double y, double v, double z){

        return (y+v+z)/3;
    }


}
