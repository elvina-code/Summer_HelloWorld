package Firstclass;

import sun.security.util.Length;

public class Arithmatics2 {
    public static void main(String[] args){
        double length = 9.5;

        float lengthInFloat = ( float) length;

        int lengthInInt = (int)length;

        int sizeInInt = 11;

        double sizeInDouble = sizeInInt;
        double anExperimentalDoubleNum = 7896.123456789012345;
        float precisionExperimentNumber = (float) anExperimentalDoubleNum;
        long someLongNumber = 12345678990864l;
        int numberFromLong = (int) someLongNumber;

        int result = 250 / (int)5.11;
        int result1 = (int)(250/5.11);


        System.out.println("I am double length " + length);
        System.out.println("I am converted to int length " + lengthInInt);
        System.out.println("I am float length " + lengthInFloat);

        System.out.println("------Double to Float experiment-------");
        System.out.println("I am a double with more precision " +anExperimentalDoubleNum);
        System.out.println("I am a converted to float from double " +precisionExperimentNumber);

        System.out.println("------Long to Int experiment-------");
        System.out.println("I am a long number " +someLongNumber);
        System.out.println("I am converted to int from long " +numberFromLong);

        System.out.println("------float double int-------");
        System.out.println("I am a result " +result);
        System.out.println("I am a result1 " +result1);


        System.out.println("I am float length " +length);


    }
}
