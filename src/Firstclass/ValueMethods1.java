package Firstclass; // How old are you?...

import java.util.Scanner;

public class ValueMethods1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);


        System.out.println("Please enter your age(number)");

        int age = userInput.nextInt();
        decideByAge(age);
        int age1 = userInput.nextInt();
        decideByAge(age1);
        int age2 = userInput.nextInt();
        decideByAge(age2);
    }

        public static void decideByAge(int age){
            if (age < 16) {
                System.out.println("You cant drive");

            } else if (age >= 16 && age <= 17) {
                System.out.println("You can drive but not vote.");

            } else if (age >= 18 && age <= 24) {
                System.out.println("You can vote but not rent a car.");

            } else {
                System.out.println("You can do pretty much anything.");
            }

        }
    }
