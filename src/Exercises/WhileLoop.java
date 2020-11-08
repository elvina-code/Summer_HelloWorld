package Exercises;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int number = (int)(Math.random() * 101);      // Generate a random number to be guessed
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        System.out.print("Enter your guess: "); // Prompt the user to guess the number
        int guess = -1;
        while (guess != number) {
            guess = input.nextInt();
        if (guess == number)
            System.out.println("Yes, the number is " + number);
        else if (guess > number) System.out.println("Your guess is too high");
        else
            System.out.println("Your guess is too low");
    } // End of loop
}
}
