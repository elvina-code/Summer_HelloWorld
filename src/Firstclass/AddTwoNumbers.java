package Firstclass;

import java.util.Scanner;

public class AddTwoNumbers {
    /* add2Integer (Input)
Write a method called add2Integers(8,9) that prompts user to enter two integers. The program shall read the two integers as int;
compute their sum; and print the result. For example,
Enter first integer: 8
Enter second integer: 9
The sum is: 17

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstInteger = scan.nextInt();
        int secondInteger = scan.nextInt();
        System.out.println("the sum is " + addTwoNumbers(firstInteger, secondInteger));

    }
    public static Integer addTwoNumbers(int firstInteger, int secondInteger){
        return firstInteger + secondInteger;
    }
}
