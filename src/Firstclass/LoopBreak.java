package Firstclass;

import java.util.Scanner;

public class LoopBreak {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String command = "";

        do {
            System.out.println("Enter S, R, P or Q to quit");
            command = userInput.next();
            if(command.equals("Q")) {
                break;
            }
        } while(true);
            System.out.println("Loop has been broken");


    }
}

