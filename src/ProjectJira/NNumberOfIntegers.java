package ProjectJira;
//As a user I would like to enter a String and check if my string has at least 3 numbers so that I can use this program for password verifications.
//Output:
//123 : true
//123 : true
//123.12 : true
//abcd123 : true
//abc12 : false
//abcd1: false
//abc: false

import java.util.Scanner;

public class NNumberOfIntegers {
    public static void main(String[] args) {
        NNumberOfIntegers nNumberOfIntegers = new NNumberOfIntegers();
        System.out.println(nNumberOfIntegers.isResult());

    }

public boolean isResult(){
    Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a string:");
                String input = userInput.next();
                //int[] nums = {0,1,2,3,4,5,6,7,8,9};
                boolean isThere = false;
                int count=0;
                for (int i=0;i<input.length();i++) {
        if (Character.isDigit(input.charAt(i))) {
        count++;

        }
        }


        if (count >= 3) {
        isThere = true;


        }
        return isThere;
        }
}

