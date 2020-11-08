package Exercises;

import java.util.Arrays;

//The following program segment is a method that should return the largest integer given an array of integers (the parameter).
public class Test9 {
    public static void main(String[] args) {
        int [] arr1 = {1, 3, 7, 9, 15, 17};
        for (int index = 0; index <= arr1.length; index+=2)
        {
            System.out.print(index + ", "+arr1[index]+ "\n");
        }
        System.out.println("" + Arrays.toString(arr1)+ largest(arr1));
    }
    private static int largest(int[] arr){
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            } //end for loop

            } //end conditional

            return largest;
    }

}
