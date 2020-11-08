package HomeWork;

import java.util.Scanner;

public class SumNumbersMethod {
    public static void main(String [] args){
        Scanner useInput = new Scanner(System.in);
         int num1 = useInput.nextInt();
         int num2 = useInput.nextInt();
         sumOfTwoNumbers(num1, num2);


    }
    public static void sumOfTwoNumbers(int firstnumber, int secondnumber){
        System.out.println("The sum of " +firstnumber+ " and "+secondnumber + " is " +(firstnumber+secondnumber));
    }
}
