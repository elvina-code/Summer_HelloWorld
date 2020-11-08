package ProjectJira.Code;

import java.util.Scanner;

public class Palindrome {

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter a word:");
            String word = scn.next();
            boolean isPalindromeResult = isPalindrome(word);
            if (isPalindromeResult) {
                System.out.println("It is Palindrome!");
            } else {
                System.out.println("It's not a Palindrome!");
            }
        }
        //Declaring separate method for finding Palindrome word.
        public static boolean isPalindrome(String inputString){
            StringBuilder stb = new StringBuilder(inputString);
            return stb.reverse().toString().equals(inputString);
        }
    }

