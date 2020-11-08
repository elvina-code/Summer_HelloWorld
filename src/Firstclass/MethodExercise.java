package Firstclass;

import java.util.Random;
import java.util.Scanner;

public class MethodExercise {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter 3 numbers ");
        int a = userInput.nextInt();
        int b = userInput.nextInt();
        int c = userInput.nextInt();


        System.out.println("The average " + a + " and " + b + " and " + c + "i s " + calculateAverage(a, b, c));
        System.out.println("The min " + a + " " + b + "" + c + " is " + findSmallest(a, b, c));
        System.out.println("I tossed the coin and " + tossTheCoin());
        System.out.println("the LoneSum is " + a + "" + b + " " + c + " " + loneSum(a, b, c));
        System.out.println("Enter radius of the circle");
        double radius = userInput.nextDouble();
        System.out.println("Area is " +calculateCircleOfArea(radius));
        System.out.println("Please enter some floating point number");
        double number = userInput.nextDouble();
        System.out.println("The number you have entered " + floatingDecided(number));

    }

    public static double calculateAverage(int a, int b, int c) {
        //double result;
        //result = (a + b +c )/3;
        //return result;

        return (a + b + c) / 3;


    }

    public static int findSmallest(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        }
        return c;

    }

    public static String tossTheCoin() {
        String coin ="";
        Random random = new Random();
        int toss = random.nextInt(2);
        switch (toss) {
            case 0:
                coin = "head";
                break;
            case 1:
                coin = "tail";
                break;
        }
        return coin;


    }

    public static int loneSum(int a, int b, int c) {
        if (a == b && a == c) {
            a = 0;
            b = 0;
            c = 0;
        }
        if (b == a) {
            a = 0;
            b = 0;

        }
        if (a == c) {
            a = 0;
            c = 0;

        }
        if (b == c) {
            b = 0;
            c = 0;

        }
        return a + b + c;

    }

    public static double calculateCircleOfArea(double radius){
        return Math.PI *Math.pow(radius,2);

    }
    public static String floatingDecided(double number){
        String result= "";
        if (number == 0.00){
            result = "zero";
        }else if (number  < 0.00){
            result = "negative";
        }else{
            result ="positive";
            if (number < 1.00) {
                result += "small";
            }else if (number > 1000000.00){
                result +="large";
        }

    }
    return result;
        }

}



