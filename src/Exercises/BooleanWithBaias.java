package Exercises;

import java.util.Scanner;

public class BooleanWithBaias {
//    Enter a number between 0-10 or 90-100: -1
//Invalid input, try again...
//Enter a number between 0-10 or 90-100: 50
//Invalid input, try again...
//Enter a number between 0-10 or 90-100: 101
//Invalid input, try again...
//Enter a number between 0-10 or 90-100: 95
//You have entered: 95
public static void main(String[] args) {
   Scanner str = new Scanner(System.in);
   boolean isValidNumber = false;
   while (!isValidNumber){
       int number =str.nextInt();
       if (number > 0 && number < 10 || number > 90 &&number < 100){
           System.out.println("entered the correct number");
           isValidNumber =true;
       }else{
           System.out.println("invalid number");
       }
   }
}

}
