package Firstclass;

import java.util.Scanner;

public class SomeMath {
    public static void main(String [] args){

        Scanner input = new Scanner (System.in);

        System.out.println("Enter first number");
        int firstNumber = input.nextInt();

        System.out.println("Enter second number");
        int secondNumber = input.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double average = (firstNumber + secondNumber) / 2;
        int max = Math.max(firstNumber, secondNumber);
        int min = Math.min(firstNumber, secondNumber);
        int distance = Math.abs(firstNumber - secondNumber);


        System.out.println("sum of " +firstNumber+ " and " +secondNumber+ " = " +sum);
        System.out.println("difference of " +firstNumber+ " and " +secondNumber+ " = " +difference);
        System.out.println("product of " +firstNumber+ " and " +secondNumber+ " = " +product);
        System.out.println("average of " +firstNumber+ " and " +secondNumber+ " = " +average);
        System.out.println("max of " +firstNumber+ " and " +secondNumber+ " = " +max);
        System.out.println("min of " +firstNumber+ " and " +secondNumber+ " = " +min);
        System.out.println("distance between " +firstNumber+ " and " +secondNumber+ " = " +distance);






    }
}
