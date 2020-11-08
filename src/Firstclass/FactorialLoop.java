package Firstclass;

import java.util.Scanner;

public class FactorialLoop {
    public static void main(String[] args) {
        Scanner userInput =new Scanner(System.in);
        int number = userInput.nextInt();
        System.out.println("The factorial " + number + " is " + factorial(number));
    }
    public static int factorial(int number){
        int result =1;
        for (int i=number; i >=1; i--){
            result =result *i;
        }
        return result;
    }
}
