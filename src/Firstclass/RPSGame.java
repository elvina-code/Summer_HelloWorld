package Firstclass;

import java.util.Scanner;
import java. util.Random;

public class RPSGame {
    public static void main(String [] args){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello, use P(aper), R(ock), or S(cissors)");

        String userGuess = userInput.next();
        Random random = new Random();

        int computerGuessNumber = random.nextInt(3);
        String computerGuessText = " ";

        switch(computerGuessNumber){
            case 0:
            computerGuessText = "P";
            break;
            case 1:
            computerGuessText = "R";
            break;
            case 2:
            computerGuessText = "S";
            break;
        }
        System.out.println("computer guess " + computerGuessText);

        switch(userGuess){
            case "P":
                if(computerGuessText.equals("P")){
                    System.out.println("Tie");

                } else if(computerGuessText.equals("R")){
                    System.out.println("User wins!");

                }else{
                    System.out.println("Computer wins");
                }
                break;

            case "S":
                if(computerGuessText.equals ("S")){
                    System.out.println("Tie");

                }else if(computerGuessText.equals("P")){
                    System.out.println("User wins");

                }else{
                    System.out.println("Computer wins");

                }
                break;

            case "R":
                if(computerGuessText.equals("R")){
                    System.out.println("Tie");

                }else if(computerGuessText.equals("P")){
                    System.out.println("Computer wins");

                }else{
                    System.out.println("User wins");
                }
                break;

                default:
                    System.out.println("Sorry only P, R, S");
                    break;



        }

    }
}
