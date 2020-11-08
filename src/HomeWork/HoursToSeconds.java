package HomeWork;

import java.util.Scanner;

public class HoursToSeconds {
    /*Write a method that converts hours into seconds.
Examples
howManySeconds(2) ➞ 7200
Notes
60 seconds in a minute, 60 minutes in an hour
Don’t forget to return your answer.

     */
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        int hours = scan.nextInt();
        int seconds = howManySeconds(hours);
        System.out.println(seconds);



    }
    public static Integer howManySeconds( int hours){
        int seconds = hours * 60* 60;
        return seconds;
    }
    
    
}
