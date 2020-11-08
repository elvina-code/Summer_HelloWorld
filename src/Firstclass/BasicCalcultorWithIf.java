package Firstclass;

import java.util.Scanner;

public class BasicCalcultorWithIf {
    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter operator *,/,+,-");
        String operator = userInput.next();
        System.out.println("Please enter two numbers");
        double firstNumber = userInput.nextDouble();
        double secondnumber = userInput.nextDouble();

        if (operator.equals("*")){
            System.out.println("The product of " + firstNumber + "and" + secondnumber + "=" +(firstNumber*secondnumber) );
        }else if (operator.equals("/")){
            if(secondnumber == 0){
                System.out.println("I can not divide " + firstNumber + "to" + secondnumber);
            }else{
                System.out.println("The division of " + firstNumber + "and" + secondnumber + "=" +(firstNumber/secondnumber) );
            }
        }else if (operator.equals("+")){
            System.out.println("The addition of " + firstNumber + "and" + secondnumber + "=" +(firstNumber+secondnumber) );
        }else if (operator.equals("-")){
            System.out.println("The division of " + firstNumber + "and" + secondnumber + "=" +(firstNumber-secondnumber) );
        }else{
            System.out.println("I can only *, /, -, + two numbers, please try again!");
        }

        }

}
