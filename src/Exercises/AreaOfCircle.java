package Exercises;



import java.util.Scanner;

import static java.lang.Math.*;

public class AreaOfCircle {
    /*
    Find the area of the circle. PS: formula of area of the circle is :Area= π r^2
            Math.pi()

     */
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter radius of the circle");
        double radius= input.nextDouble();

        System.out.println("The area is "+calculateCircleOfArea(radius));


    }

    public static double calculateCircleOfArea(double radius) {

        return Math.PI * Math.pow(radius , 2);
    }



}
