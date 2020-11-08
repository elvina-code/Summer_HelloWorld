package HomeWork;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();

        printMultTable(number);



    }
    public static void printMultTable(int number){
        for(int i = 1; i <= number; i ++){
            for(int j = 1; j <= 10; j++){
                System.out.print(i + " * " +j+ " = " +(i*j) +"\t"); // print

            }
            System.out.println();// println
        }
    }
}
