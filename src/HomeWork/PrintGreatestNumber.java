package HomeWork;

import java.util.Scanner;

public class PrintGreatestNumber {
    /* TTake three numbers from the user and print the greatest number.

Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 3 numbers");

        int a,b,c, max;
        a =scan.nextInt();
        b =scan.nextInt();
        c = scan.nextInt();
        max =a;

        if(a > b && a > c) {
            max = a;
        }else if(b > a && b >c) {
            max = b;
            }
        else if (c >a && c > b){
            max =c;
        }
        System.out.println("The greatest of " + a + " and " + b + "and " + c + " is " + max);
    }

    }

