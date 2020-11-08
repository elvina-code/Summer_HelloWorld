package Firstclass;


import java.util.Scanner;

public class CalculatirWithMethod {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter operator: (*, /, +, -)");
        String operator = userInput.next();

        System.out.println("Enter two numbers:");
        double firstNumber = userInput.nextDouble();
        double secondNumber = userInput.nextDouble();

        switch (operator) {
            case "*":
                multiply(firstNumber, secondNumber);
                break;
            case "/":
                divide(firstNumber, secondNumber);
                break;
            case "-":
                subtract(firstNumber, secondNumber);
                break;
            case "+":
                add(firstNumber, secondNumber);
                break;
            default:
                System.out.println("i can only - + / * ");
                break;
        }
    }

    public static void multiply(double num1, double num2) {
        System.out.println("Product of number " + num1 + " and " + num2 + " = " + (num1 * num2));
    }

    public static void divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("I can not divide into 0");
        } else {
            System.out.println("The division of " + num1 + "into " + num2 + " = " + (num1 / num2));
        }
    }

    public static void subtract(double num1, double num2) {
        System.out.println("The difference of " + num1 + "and " + num2 + " = " + (num1 - num2));
    }

    public static void add(double num1, double num2) {
        System.out.println("The sum of " + num1 + "and " + num2 + " = " + (num1 + num2));
    }
}


