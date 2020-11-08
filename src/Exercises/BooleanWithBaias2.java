package Exercises;

import java.util.Scanner;
//Write a program that prompts user for the mark (between 0-100 in int) of 3 students; computes the average (in double);
// and prints the result rounded to 2 decimal places. Your program needs to perform input validation. For examples,
public class BooleanWithBaias2 {

    //    Enter the mark (0-100) for student 1: 56
//Enter the mark (0-100) for student 2: 101
//Invalid input, try again...
//Enter the mark (0-100) for student 2: -1
//Invalid input, try again...
//Enter the mark (0-100) for student 2: 99
//Enter the mark (0-100) for student 3: 45
//The average is: 66.67
    public static void main(String[] args) {
        int numOfStudents= 3;

        Scanner str = new Scanner(System.in);

        int sum =0;

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter the mark (0-100) for student"+(i+1));
            int mark =str.nextInt();
            while (mark < 0 || mark >100){
                System.out.println("Invalid input, try again... ");
                mark=str.nextInt();
            }
            sum +=mark;
        }
        System.out.println("The average is " +sum/numOfStudents);

    }
}
