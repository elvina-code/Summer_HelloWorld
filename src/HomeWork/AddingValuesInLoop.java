package HomeWork;
//Write a program that gets several integers from the user. Sum up all the integers they give you. Stop looping when they enter a 0. Display the total at the end.
//
//You must use a while loop.
import java.util.Scanner;

public class AddingValuesInLoop {
    /*I will add up the numbers you give me.
            Number: 6
    The total so far is 6
    Number: 9
    The total so far is 15
    Number: -3
    The total so far is 12
    Number: 2
    The total so far is 14
    Number: 0

    The total is 14.*/
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me until you enter 0");
        int num = s.nextInt();
        int i =0;
        while (i < num) {
            int sum =0;
            sum +=sum +num;
            i ++;// looks like it will run forever!
            System.out.print("Enter a positive number: "+ sum);
            if (i > 0)   // the input value is OK, so jump out of loop
                break;
            System.out.println("Your answer must be > 0.");
        }


    }

    }
