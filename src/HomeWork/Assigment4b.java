package HomeWork;
import java.util.Scanner;

public class Assigment4b {
    /* Write a Java program and compute the sum of the digits of an integer.

Hint: to find the remainder in this example last digit you should use % symbol
to find the first digit you should use / symbol.
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7

     */
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number:");

    int n = input.nextInt();

    int a = n % 10;//25%10=2.(5) --> 5
    int b = n / 10;//25/10=2.5--> 2
    int c = a + b;


    System.out.println("Sum of Digits:"+c);


}
}
