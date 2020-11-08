package Firstclass;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter operator *,/,+,-");
        String operator = userInput.next();
        System.out.println("Please enter two numbers");
        double firstNumber = userInput.nextDouble();
        double secondnumber = userInput.nextDouble();

        switch (operator){
            case "*":
                System.out.println("The product of " + firstNumber+ "and" + secondnumber+ "=" +(firstNumber*secondnumber) );
                break;

            case "/":
                if (secondnumber == 0) {
                    System.out.println("I can not divide" + firstNumber + "to" + secondnumber);
                }else {
                System.out.println("The division of " + firstNumber + "and" + secondnumber + "=" + (firstNumber / secondnumber));
                }
                break;

            case "+":
                System.out.println("The addition of " + firstNumber+ "and" + secondnumber+"=" +(firstNumber+secondnumber) );
                break;

            case "-":
                System.out.println("The division of " + firstNumber+ "and" + secondnumber+"=" +(firstNumber-secondnumber) );
                break;
            default:
                System.out.println("I can only *, /, -, + two numbers, please try again!");
        }
    }
}
