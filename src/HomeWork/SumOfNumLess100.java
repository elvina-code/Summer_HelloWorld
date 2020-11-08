package HomeWork;

import java.util.Scanner;

public class SumOfNumLess100 {
    /*Given two numbers, return true if the sum of both numbers is less than 100. Otherwise return false.
Examples
lessThan100(22, 15) ➞ true
// 22 + 15 = 37
lessThan100(83, 34) ➞ false
// 83 + 34 = 117 (edited)

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("lessThan100 " + addTwoNumbers(a, b));

        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println("lessThan100 " + addTwoNumbers(a, b));
    }

    public static boolean addTwoNumbers(int a, int b) {
        boolean result;

        if ((a + b) < 100) {
            result = true;

        } else {
            result = false;
        }

        return result;
    }

}