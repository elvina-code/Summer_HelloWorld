package HomeWork;

import java.util.Scanner;

public class MaltiplicationTable {
    //Write a program in Java to display the multiplication table of a given integer.
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int num =userInput.nextInt();

    for(int i =1; i<=num; i++){
        System.out.println(i + " * " + num + " = " +(i*num));
    }
    }
}
