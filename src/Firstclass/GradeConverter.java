package Firstclass;

import java.util.Scanner;

public class GradeConverter {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter grade");
        int grade = userInput.nextInt();


        if (grade > 0 && grade < 50) {
            System.out.println("D");
        } else if (grade >= 50 && grade < 65) {
            System.out.println("C");
        } else if (grade >= 65 && grade < 85) {
            System.out.println("B");
        } else if (grade >= 85 && grade <= 100){
            System.out.println("A");
        } else {
            System.err.println("Out of range");
        }

    }
}
