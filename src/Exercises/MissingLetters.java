package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MissingLetters {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("How many letters you want to enter? ");

            int size = scanner.nextInt();
            String[] letters = new String[size];

            System.out.println("Please enter letters");
            for (int i=0; i<size; i++){
                letters[i] = scanner.next();
            }

            MissingLetters missingLetter = new MissingLetters();
            System.out.println(missingLetter.findMissingLetter(letters));
        }
        public  String findMissingLetter(String [] arr) {
            String result = "";
            String myArray = Arrays.toString(arr);
            for (int i=97;i<=122;i++){
                String str = (char)i+ "";
                if(!myArray.contains(str)){
                    result +=str + " ";
                }
            }
            return result;
        }
    }


