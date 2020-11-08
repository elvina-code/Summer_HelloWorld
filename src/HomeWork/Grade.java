package HomeWork;

import java.util.Scanner;

public class Grade {
    /*This program calculates the grade of a student based on the marks entered by user in each subject. Program prints the grade based on this logic.
If the average of marks is >= 80 then prints Grade ‘A’
If the average is <80 and >=60 then prints Grade ‘B’
If the average is <60 and >=40 then prints Grade ‘C’
else prints Grade ‘D

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter grade");
        int grade = scan.nextInt();
        String print ="";
        if(grade >= 80){
            print = "A";
        }else if (grade < 80 && grade >= 60){
            print = "B";
        }else if(grade < 60 && grade >= 40){
            print = "C";
        }else{
            print = "D";
        }
        System.out.println("Your grade is " +print);


    }
}
