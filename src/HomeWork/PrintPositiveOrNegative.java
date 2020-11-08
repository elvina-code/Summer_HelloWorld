package HomeWork;

import java.util.Scanner;

public class PrintPositiveOrNegative {
    /*Write a Java program to get a number from the user and print whether it is positive or negative.

Test Data
Input number: 35
Expected Output :
Number is positive

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scan.nextInt();
        String result ="";

        if(number < 1){
            result = "negative";
            System.out.println("Number is "+result);
        }else if (number >1){
            result = "positive";
            System.out.println("Number is "+result);
        }
    }
}
