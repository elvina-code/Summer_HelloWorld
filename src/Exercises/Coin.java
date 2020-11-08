package Exercises;

import java.util.Random;
import java.util.Scanner;

public class Coin {
    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("I toss the coin and it is  "+tossTheCoin());


    }
    public static String tossTheCoin(){
        Random random = new Random();
        String coin = " ";
        int toss = random.nextInt(2);

        switch(toss){

            case 0:
                coin =  "head";
            break;

            case 1:
                coin  = "tail";
            break;

        }

        return coin;
    }


}
