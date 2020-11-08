package HomeWork;

import java.util.Scanner;

public class PrintNumberInWord {
    /*Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other,
    respectively. Use (a) a "nested-if" statement;

Hints
/**
 * Trying nested-if and switch-case statements.
 */
    // Save as "PrintNumberInWord.java"
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number from 1 to 9");
        int number= scan.nextInt();// Set the value of "number" here! // Using nested-if

        if (number ==1) {   // Use == for comparison
            System.out.println("One");
        } else if (number ==2){
            System.out.println("Two");
        } else if ( number ==3){
            System.out.println("Three");
        } else if ( number ==4){
            System.out.println("Four");
        } else if ( number ==5){
            System.out.println("Five");
        } else if ( number ==6){
            System.out.println("Six");
        } else if ( number ==7){
            System.out.println("Seven");
        } else if ( number ==8){
            System.out.println("Eight");
        } else if ( number ==9){
            System.out.println("Nine");
        } else{
            System.out.println();
        }
    }
}
