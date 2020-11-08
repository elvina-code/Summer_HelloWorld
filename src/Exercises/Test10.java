package Exercises;

import java.util.Arrays;

//Finish the method getSumChars below to return the total number of characters in the array of strings strArr.
public class Test10 {
        public static int getSumChars(String[] strArr)
        {
            int sumOfChar= 0;
            for(int i = 0; i<strArr.length; i++){
                sumOfChar +=strArr[i].length();
            }
            return sumOfChar;

        }
        public static void main(String[] args)
        {
            String[] strArr = {"hi", "bye", "hola"};
            System.out.println(getSumChars(strArr));
            System.out.println("sum of characters" + Arrays.toString(strArr) + "is"+ getSumChars(strArr));
        }
    }



