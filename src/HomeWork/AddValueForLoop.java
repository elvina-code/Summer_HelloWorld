package HomeWork;

import java.util.Scanner;

public class AddValueForLoop {
    /* Adding Values with a for loop/while loop
Write a program that gets an integer from the user. Add up all the numbers from 1 to that number, and display the total. Use a for/
while loop to do it.
Number: 5
1 2 3 4 5
The sum is 15.
Number: 8
1 2 3 4 5 6 7 8
The sum is 36.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number= input.nextInt();
        int sum = 0;
        for (number = 1; number  <= 8; number ++) {
            sum += number;
        }
        System.out.println("The sum is " + sum);


    }

    }

