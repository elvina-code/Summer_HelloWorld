package Firstclass;
import java.util.Scanner;

public class DecisionIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        int max, min;

        /* if(firstNum > secondNum){

            System.out.println(firstNum + " first is the bigger then second");

        }else{

            System.out.println(secondNum + " second is the bigger then first");

        }
            System.out.println("I will print anyway");

         */
        if (firstNum > secondNum) {
            max = firstNum;
            min = secondNum;

            System.out.println("the max of" + firstNum + "and " + secondNum + " is " + max);
            System.out.println("the min of" + firstNum + "and " + secondNum + " is " + min);

        } else if (firstNum == secondNum) {
            System.out.println("The numbers are equal");

        } else {

            max = secondNum;
            min = firstNum;

            System.out.println("the max of" + firstNum + "and " + secondNum + " is " + max);
            System.out.println("the min of" + firstNum + "and " + secondNum + " is " + min);
        }

    }
}

