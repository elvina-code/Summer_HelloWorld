package Recap;
// calculate a subarray

import java.util.Arrays;

public class SubArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {2,4};

        for(int i = 0; i < arr1.length; i++){
            for(int j = i; j < arr1.length; j++){
                printSubArray(arr1,i, j);
                System.out.println();
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("arr1 is equal arr1 " + isEqualArrays(arr1,arr1));
        System.out.println("arr1 is equal arr2 " + isEqualArrays(arr1,arr2));

    }
    public static void printSubArray(int [] array, int start, int end ){
        for( int i = start; i<= end; i++){
            System.out.print(array[i] + " ");
        }

    }
    public static Boolean isEqualArrays(int [] arr1, int [] arr2){
        Boolean result = false;
        if(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] == arr2[i]){
                    return true;

                }else{
                    return false;
                }
            }
        }
        return result;
    }
}
