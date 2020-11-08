package Firstclass.Array;
//Write a Java program to shuffle a given array of integers. [1,2,3,4] -> [2,1,4,3]

import java.util.Random;

public class ArraysShuffle {
    public static void main(String[] args) {
        ArraysShuffle ash = new ArraysShuffle();
        int[] array = {3,2,5,0,7};
        ash.shuffle(array);
        System.out.println("Array after shuffle");
        ash.printIntArray(array);
        System.out.println("\n");
    }
    public void swap(int[] array, int num1, int num2) {
        int temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;

    }

    public void shuffle(int[] array){
        Random random= new Random();

        for(int i = 0; i < array.length; i++){
            int a = random.nextInt(array.length);
            int b = random.nextInt(array.length);
            swap(array, a, b);
        }
    }
    public void printIntArray(int[] numberArray){
        for (int i = 0; i < numberArray.length; i++){
            System.out.println("["+i+ "]  = "+numberArray[i]);
        }
    }
}
