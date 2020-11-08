package Exercises.StudentMentor;

import java.util.Scanner;

public class RemoveWord {
    public static void main(String[] args) {
        String str = "I love my country";

        String word = "country";

        System.out.println(removeWord(str,word));
    }
    public static String removeWord(String sentence, String target){
        return sentence.replace(target, "").trim();
    }
}
