package HomeWork;

import java.util.Scanner;

public class AverageAndSum {
    /*Write a program in Java to input 5 numbers from keyboard and find their sum and average.

Test Data
Input the 5 numbers : 1 2 3 4 5
Expected Output :

Input the 5 numbers :
1
2
3
4
5
The sum of 5 no is : 15
The Average is : 3.0

     */
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        System.out.println("Enter 5 numbers:");
        num1= number.nextInt();
        num2= number.nextInt();
        num3= number.nextInt();
        num4= number.nextInt();
        num5= number.nextInt();
        int sum = (num1+num2+num3+num4+num5);
        int average =(num1+num2+num3+num4+num5)/5;

        System.out.println("The sum is " +sum);
        System.out.println("The average is " +average);
    }


}
