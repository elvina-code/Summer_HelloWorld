package HomeWork;


import java.util.Scanner;

public class MovieApplication {

    /* Homework —> Please write Movie application program,
1) Ask age from user.
2) If user’s age from 1- 6 please suggest cartoon. King Lion etc…
 3) 7-17 —> Discovery channel etc…
 4) 18 - 25 —— action movie  Avatar…
 5) 26 - 40 ——> news channel FOX CNN etc…
  6) 41 - 100 ——> you can watch anything you want
 7) if user enters none of them ——> Print an warning message

     */
public static void main(String [] args){
    Scanner newInput = new Scanner(System.in);

    System.out.println("Please enter your age:");
    int age = newInput.nextInt();

    if(age >= 1 && age  <= 6) {
        System.out.println("Cartoons");

    }else if (age >= 7 && age  <= 17) {
            System.out.println("Discovery channel");

    }else if(age >=18 && age <= 25){
         System.out.println("action movie  Avatar");

    }else if(age >=26 && age <=40){
        System.out.println("news channel FOX CNN");

    }else if(age >=41 && age <=100){
        System.out.println("you can watch anything you want");

    }else
        System.err.println("warning message");
    }

}



