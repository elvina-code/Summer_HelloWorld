package Firstclass;

import java.util.Random;
import java.util.Scanner;

public class DevxPicker1 {

    public static void main(String [] args){
        final int Number_Of_Students = 17;

        Random picker = new Random();

        Scanner userInput = new Scanner (System.in);
        System.out.println("Please select mode(1-QA_StudsOnly, 2-Game_All)");
        int appMode =userInput.nextInt();

        int pickedNumber = picker.nextInt(Number_Of_Students);

        switch (pickedNumber){

            case 0:
                System.out.println("Baktygul");
                break;
            case 1:
                System.out.println("Irina B");
                break;
            case 2:
                System.out.println("Jiyde");
                break;
            case 3:
                System.out.println("Aiana");
                break;
            case 4:
                System.out.println("Zalkar");
                break;
            case 5:
                System.out.println("Azamat");
                break;
            case 6:
                System.out.println("Irina R");
                break;
            case 7:
                System.out.println("Ram");
                break;
            case 8:
                System.out.println("Meruert");
                break;
            case 9:
                System.out.println("Mirgul");
                break;
            case 10:
                System.out.println("Elvina");
                break;
            case 11:
                System.out.println("Almaz");
                break;
            case 12:
                System.out.println("Kubah");
                break;
            case 13:
                System.out.println("Luis");
                break;
            case 14:
                if (appMode == 2) {
                    System.out.println("Nuta");
                    break;
                }
            case 15:
                System.out.println("Gauhar");
                break;
            case 16:
                if (appMode == 2) {
                    System.out.println("Mirlan");
                    break;
                }
            default:
                System.out.println("Please try again!");
                break;
        }



    }
}
