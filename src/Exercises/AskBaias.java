package Exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class AskBaias {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("enter number when type 0 is finished ");
        int in = reader.nextInt();
        while(in !=0){
            array.add(in);
            in=reader.nextInt();
        }

        printArray();

        System.out.println("what number do you want to delete?");
        int del = reader.nextInt();
        for(int i =0; i<array.size(); i++){
            if(array.get(i)== del){
                array.remove(i);
            }
            break;
        }
        printArray();

    }
    public static void printArray(){
        System.out.println("---------------");
        ArrayList<Integer> array = new ArrayList<>();
        for(int i : array){
            System.out.println(i);
        }
    }

}
