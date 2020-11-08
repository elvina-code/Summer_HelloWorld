package HomeWork;

import java.util.Scanner;

public class CompareTwoIntegersBoolean {
    public static void main(String[] args) {
        /*int a, b;
        Scanner digit = new Scanner(System. in);
        System.out.println("Enter the number");
        a = digit.nextInt();
        b = digit.nextInt();
        boolean isEqual = a ==b;
        boolean isNotEqual = a !=b;
        System.out.println("The number " +a + " and " +b+ " is equal ");
        System.out.println("The number " +a + " and " +b+ " is not equal ");
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        compareTwoNumbers(num1, num2);

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        compareTwoNumbers(num1, num2);
    }
        public static void compareTwoNumbers(int a, int b){
            if (a != b) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }

        }
    }





