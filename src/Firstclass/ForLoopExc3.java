package Firstclass;

import java.util.Scanner;

public class ForLoopExc3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean isValidInput = false;
        int a = 0;
        do{
            System.out.println("enter Integer to continue");
            if(userInput.hasNext()){
                isValidInput = true;
                a = userInput.nextInt();
                System.out.println("You got another chance");
            }else{
                isValidInput = false;
                System.out.println("No another chance");
            }

        }while (isValidInput);

    }
}
