package Exercises;

import java.util.Scanner;

public class FindAverageOf3Num {
    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");

        int a = userInput.nextInt();
        int b = userInput.nextInt();
        int c = userInput.nextInt();
        System.out.println("The average of 3 numbers " +calculateAvarege(a, b, c));


    }
    public static double calculateAvarege(int a, int b, int c){
        return (a + b + c)/3;

    }
}
