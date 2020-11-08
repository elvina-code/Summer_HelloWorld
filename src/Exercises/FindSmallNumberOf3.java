package Exercises;

import java.util.Scanner;

public class FindSmallNumberOf3 {

        /* Exc1: Write a Java method to find the smallest number among three numbers
    Input the first number: 25
    Input the Second number: 37
    Input the third number: 29
    Expected Output:
    The smallest value is 25.0

         */
        public static void main(String [] args){

            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter 3 numbers:");

            int a = userInput.nextInt();
            int b = userInput.nextInt();
            int c = userInput.nextInt();


            System.out.println("The smallest value of 3 "+ smallValue(a,  b, c));


        }
        public static double smallValue(int a, int b, int c){
            if (a < b && a < c){
                return a;
            }else if (b < a && b < c){
                return b;
            }else
                return c;

        }

    }
//public static double smallest(double a, double b, double c)
//    {
//        return Math.min(Math.min(a, b), c);
//    }