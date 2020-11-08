package Firstclass;

import java.util.Scanner;

public class UserInput {
    public static void main(String [] args){

        Scanner userInput = new Scanner(System.in); // new object

        System.out.println("Please print your name!");
        String name = userInput.nextLine();

        System.out.println("Please print your marital Status!");
        String maritalStatus = userInput.next();

        System.out.println("Please print your age!");
        int age = userInput.nextInt();

        System.out.println("Please print your height!");
        int height= userInput.nextInt();

        System.out.println("Please print your weight!");
        int weight= userInput.nextInt();

        System.out.println("Please enter the distance you have run!");
        double distance= userInput.nextDouble();

        System.out.println("Please enter time you have covered:");
        double time= userInput.nextDouble();

        double pace = distance/time;


        boolean isEleigible = (maritalStatus == "u") && (age >= 21 && age <= 35) && (height >180) && (weight > 70 && weight < 80);
        System.out.println("Your pace is:" +pace);


        System.out.println("Hello! " + name + ", your eligibilty is "+isEleigible);

        //System.out.println("Please print your name!");

        //String firstName = userInput.nextLine();

        //System.out.println("Please enter your age!");

        //int age = userInput.nextInt();

        //String IamWholeline = userInput.nextLine();

        //System.out.println("You entered a new line of text" +IamWholeline);
        //System.out.println("Hello! " + firstName + ", I hope you are ok" );



        //System.out.println("Hello! " + firstName + ", you are "+age+" years old!");

    }
}
