package Firstclass.Array;


import java.util.Arrays;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class MaximizingTheFinalElement {

    public static void main(String[] args) {
        int[] array = {3, 2, 5, 0, 7};

        Arrays.sort(array);


        System.out.println(array);
    }

    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    swap(array, i, j);
                }
            }
        }
    }

    private void swap(int[] array, int num1, int num2) {
        int temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;

    }
}
