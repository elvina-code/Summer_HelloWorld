package HomeWork;
// Write a program in Java to display the cube of the number up to given an integer.

import java.util.Scanner;

public class DisplayTheCube {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int cube = userInput.nextInt();

        for(int i= 1; i <= cube; i++){
            System.out.println("Number is : " + i +" and cube of " + i +" is : "+(i*i*i));
        }
    }
}
