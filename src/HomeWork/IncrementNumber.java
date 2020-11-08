package HomeWork;

import java.util.Scanner;

public class IncrementNumber {
/*Create a function that takes a number as an argument, increments the number by +1 and returns the result.
Examples
addition(0) ➞ 1
addition(-3) ➞ -2

 */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    incrementingNumber(num);

    num = scan.nextInt();
    incrementingNumber(num);


    }
    public static void incrementingNumber(int a) {
        a = a + 1;
        System.out.println("addition " + a);
    }

}


