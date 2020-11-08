package HomeWork;
/*Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
Test Data
Input number: 3
Expected Output :
Wednesday
     */

import java.util.Scanner;

public class InputIntegerBetween1To7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int day = scan.nextInt();
        String weeks ="";
        switch(day){
            case 1:
                weeks= "Monday";
                break;
            case 2:
                weeks ="Tuesday";
                break;
            case 3:
                weeks = "Wednesday";
                break;
            case 4:
                weeks = "Thursday";
                break;
            case 5:
                weeks = "Friday";
                break;
            case 6:
                weeks = "Saturday";
                break;
            case 7:
                weeks = "Sunday";
                break;
            default:
                System.out.println("You entered wrong number");
                break;
        }
        System.out.println(weeks);
    }

}
