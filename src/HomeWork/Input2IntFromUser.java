package HomeWork;
/* Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, the average, the distance (the difference between integer),
    the maximum (the larger of the two integers), the minimum (smaller of the two integers).
Test Data
Input 1st integer: 25
Input 2nd integer: 5
Expected Output :
Sum of two integers: 30
Difference of two integers: 20
Product of two integers: 125
Average of two integers: 15.00
Distance of two integers: 20
Max integer: 25
Min integer: 5
     */

import java.util.Scanner;

public class Input2IntFromUser {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter first number");
    int firstnumber = input.nextInt();

    System.out.println("enter second number");
    int secondNumber =input.nextInt();

    int sum = firstnumber + secondNumber;
    int difference = firstnumber - secondNumber;
    int product = firstnumber * secondNumber;
    int average = ( firstnumber + secondNumber)/2;
    int distance = Math.abs(firstnumber -secondNumber);
    int max = Math.max(firstnumber,secondNumber);
    int min = Math.min(firstnumber, secondNumber);

    System.out.println("Sum of two integers:" +sum);
    System.out.println("Difference of two integers:" + difference);
    System.out.println("Product of two integers:" + product);
    System.out.println("Average of two integers:" + average);
    System.out.println("Distance of two integers:" + distance);
    System.out.println("Max of two integers:" + max);
    System.out.println("Min of two integers:" + min);

}

}
