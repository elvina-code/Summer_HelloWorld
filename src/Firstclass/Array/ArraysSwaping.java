package Firstclass.Array;

import java.util.Arrays;


public class ArraysSwaping {
    public static void main(String[] args) {
        ArraysSwaping asw = new ArraysSwaping();
        int[] array = {2, 4, 5, 8, 9};
        System.out.println("array before swaping");

        System.out.println(Arrays.toString(array)); //asw.printIntArray(array); REPLACED
        asw.swap(array, 2, 3);
        System.out.println("array after swap");

        System.out.println(Arrays.toString(array));//asw.printIntArray(array); REPLACED


    }

    public void swap(int[] array, int num1, int num2) {
        int temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;

    }

    public void printIntArray(int[] numberArray) {
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("[" + i + "]  = " + numberArray[i]);
        }
    }
}
