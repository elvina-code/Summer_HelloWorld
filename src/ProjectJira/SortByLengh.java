package ProjectJira;

import java.util.Arrays;
import java.util.Scanner;

public class SortByLengh {
    /*Description
Create a function that takes a string and returns a string ordered by the length of the words. From shortest to the longest word.
 If there are words with the same amount of letters, order them alphabetically.

Examples
sortByLength("Hello my friend") ➞ "my Hello friend"

sortByLength("Have a wonderful day") ➞ "a day Have wonderful"

sortByLenght("My son loves pineapples") ➞ "My son loves pineapples"*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence : ");
        String line = sc.nextLine();

        System.out.println(sortByLength(line));
    }
    public static String sortByLength(String str) {

        String temp = "";
        String[] eachWordArray = str.split(" ");
        String newStrings = "";

        for (int i = 0; i < eachWordArray.length; i++) {
            for (int j = 0; j < eachWordArray.length; j++) {
                if (eachWordArray[i].length() < eachWordArray[j].length()) {
                    temp = eachWordArray[i];
                    eachWordArray[i] = eachWordArray[j];
                    eachWordArray[j] = temp;
                }else if (eachWordArray[i].length()==eachWordArray[j].length()){
                    if (eachWordArray[i].charAt(0)<eachWordArray[j].charAt(0)){
                        temp = eachWordArray[i];
                        eachWordArray[i] = eachWordArray[j];
                        eachWordArray[j] = temp;
                    }
                }
            }
        }
        newStrings = Arrays.toString(eachWordArray);

        return newStrings;
    }


}
