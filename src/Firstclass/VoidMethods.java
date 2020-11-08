package Firstclass;

import java.util.Scanner;
import java.util.Random;

public class VoidMethods {
    public static void main(String[] args) { //main executable method, entry point to app
        Scanner input = new Scanner(System.in); //declare scanner form user
        System.out.println("Enter your name");// print
        String name = input.next();
        printName(name);// name=method printName =argument

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        addTwoNumbers(num1, num2);

        num1 = input.nextInt();
        num2 = input.nextInt();
        addTwoNumbers(num1, num2);

        int sum = addition(num1, num2);
        // System.out.println(num1+"%" +2 + "" +(num1%2));

        printRandomNumber();
        isEvenOrOdd (101);
        isEvenOrOdd(222);
        isEvenOrOdd(101);
        isEvenOrOdd(200);

    }

        public static void printName (String name){
            System.out.println("The name is " + name);
        }

        public static void addTwoNumbers (int number1, int number2){ // int declaration
            System.out.println("Sum of " +number1+ " and " +number2+ " = " +(number1 + number2));

        }
        public static int addition(int num1, int num2){ // int return type

        return num1 + num2;
        }
        public static void printRandomNumber(){
        Random rnd = new Random();
        System.out.println(rnd.nextInt(10));

    }

    public static void isEvenOrOdd(int number){
        if (number % 2 ==0){
            String result = number +"even number";
            printMyString(result);                  //printMyString(number + "even number");//System.out.println("even number");

        }else {
            printMyString(number + "odd number");//System.out.println("odd number");
        }
    }
    public static void printMyString (String text){
        System.out.println(text);
    }
}
