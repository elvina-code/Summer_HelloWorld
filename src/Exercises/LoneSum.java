package Exercises;

import java.util.Scanner;

public class LoneSum {
    /* Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
loneSum(1, 2, 3) → 6
loneSum(3, 2, 3) → 2
loneSum(3, 3, 3) → 0

     */
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");

        int a = userInput.nextInt();
        int b = userInput.nextInt();
        int c =userInput.nextInt();
        System.out.println("The lonesum of numbers is " +loneSum(a,b,c));



        }
    public static double loneSum(int a, int b, int c){
        if (a == b && a == c){
            a=0;
            b=0;
            c=0;
        }else if(b==c){
            b=0;
            c=0;
        }else if(a==b){
            a=0;
            b=0;
        }else if (a==c){
            a=0;
            c=0;
        }
        return (a + b + c);

    }
}
