package HomeWork;

import java.util.Scanner;

public class TestPalindrom {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String word =userInput.next();
        System.out.println(isPalindrome(word));


    }
    static boolean isPalindrome(String str)  {
        StringBuilder stb =new StringBuilder();
        int i= 0, j= str.length() - 1;
        while (i < j) {

            if (stb.reverse().toString().equals(str))

            return false;

            ++i;
            --j;
        }

        return true;
    }
}
