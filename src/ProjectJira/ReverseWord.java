package ProjectJira;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence or word");
        String word = input.nextLine();
        String a = splitTheSentence(word);
        System.out.println(a);
    }

    public static String splitTheSentence(String str) {
        String[] spltWrd = str.split(" ");
        for (int i = 0; i < spltWrd.length; i++) {
            spltWrd[i] = reverseOdd(spltWrd[i]);
        }
        String splitWord = Arrays.toString(spltWrd);
        return splitWord;
    }

    public static String reverseOdd(String str) {
        String reversedOddWord = "";
        if (str.length() % 2 != 0) {
            for (int i = str.length() - 1; i >= 0; i--) {
                reversedOddWord += str.charAt(i);
            }
        } else {
            reversedOddWord = str;
        }
        return reversedOddWord;

    }

}

