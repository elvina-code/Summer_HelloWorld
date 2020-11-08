package Exercises;

import java.util.Scanner;

public class FloatingDecide {
    /* Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative".
    Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
(edited)
Input a number: 25
Expected Output :
Input value: 25
Positive number

     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter floating pointnumber");
        double number = Input.nextDouble();
        System.out.println("The number you entered " + foatingDecide(number));

    }

    public static String foatingDecide(double number){
        String result = "";
        if(number == 0){
            result = " zero ";
        } else if(number < 0.00){
            result = " negative ";

        } else {
            result =" positive ";
            if(number < 1.00) {
                result += " small ";
            }else if(number > 10000000){
                result += " large ";
            }else{
                result = result;
            }

        }

        return result ;
    }

}


