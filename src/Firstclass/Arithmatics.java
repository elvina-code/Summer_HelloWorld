package Firstclass;

public class Arithmatics {

    public static void main(String [] args){

        int number1 = 11;
        int number2 = 22; // can be in single line
        double cents = 0.3, exampleDouble = 0.5; // can be in single line like this


        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        int fraction = number1 / number2;
        int remainder = number1 % 3;

        // int combination = sum- difference * product/ fraction % remainder;


        long x = 5;
        long y = (x=6);

        System.out.println("I am X " + x);
        System.out.println("I am Y " + y);

        /* System.out.println(number1 + " + " + number2 + " = " + sum);
        System.out.println(number1 + " - " + number2 + " = " + difference);
        System.out.println(number1 + " * " + number2 + " = " + product);
        System.out.println(number1 + " / " + number2 + " = " + fraction);
        System.out.println(number1 + " % " + 3 + " = " + remainder);
        */

        sum +=10; // sum = sum + 10;
        sum -=10; // sum = sum - 10;
        sum *=10; // sum = sum * 10;
        sum /=10; // sum = sum / 10;


        String cup1 = "cola";
        String cup2 = "fanta";

        System.out.println("In cup1 I have " + cup1);
        System.out.println("In cup2 I have " + cup2);

        int numberInteger = 3;
        double numberDouble = 1.4;
        System.out.println(numberInteger + numberDouble);
        System.out.println(5L + 10.1F);

        long num1 = 10;
        float num2 = 2.5f;
        System.out.println(num1 * num2); //long*float-->25.0


        String empty = cup2;
        cup2 = cup1;
        cup1 = empty;

        System.out.println("In cup1 I have " + cup1);
        System.out.println("In cup2 I have " + cup2);






    }
}
