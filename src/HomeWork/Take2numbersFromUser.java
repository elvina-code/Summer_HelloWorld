package HomeWork;

import java.util.Scanner;

public class Take2numbersFromUser {
    /* Take two numbers from the user and print the greatest number.
Test Data
Input the 1st number: 25
Input the 2nd number: 87
Expected Output :
The greatest: 87
     */

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int num1, num2;
        num1 = input.nextInt();
        num2 = input.nextInt();
        int max;


        if (num1 >= num2){
            max = num1;
        }else{
                max = num2;
            }

        System.out.println("The greatest:" +max);
        }


    }

