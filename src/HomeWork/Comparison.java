package HomeWork;

import java.util.Scanner;

public class Comparison {
    /*Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output


25 < 39     or       39 > 25        or       "The fist number is smaller"


     */
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter two numbers:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println(+num2+ " number is smaller");
        }else{
            System.out.println(+num1+ " number is smaller");
        }
    }
}
