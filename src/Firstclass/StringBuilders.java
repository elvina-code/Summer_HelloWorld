package Firstclass;

import java.util.Scanner;

public class StringBuilders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder stb = new StringBuilder();
        stb.append("Monday");
        stb.append("Tuesday");
        stb.insert(6,'-');
        stb.delete(3,6);

        stb.append('s');
        stb.reverse();

        System.out.println(stb);
        System.out.println("reverse is "+stb.reverse());

        //////////////////////////
        System.out.println("Guess a word");
        String word = scan.next();


        boolean isPalindromResult = isPalindrome(word);

        if(isPalindromResult){
            System.out.println("This is palindrom");
        }else{
            System.out.println("This is not palindrom");
        }

        }
    public static boolean isPalindrome(String inputString){
        StringBuilder stb = new StringBuilder(inputString);
        return stb.reverse().toString().equals(inputString);



    }


}
