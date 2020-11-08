package Firstclass.Array;
import java.util.Arrays;

public class ArraysSorting {
    public static void main(String[] args) {
        ArraysSorting as = new ArraysSorting(); // has to be same as class
        int[] array = {3,2,5,0,7};
        System.out.println("array before sorting");
        System.out.println(Arrays.toString(array));//as.printIntArray(array);

        System.out.println("array after sorting");
        as.sort(array); // or easy one  only Arrays.sort(array);
        as.printIntArray(array);
        System.out.println(Arrays.toString(array));
    }

    public void swap(int[] array, int num1, int num2) {
        int temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;

    }

    public void sort(int []array){
        for(int i = 0; i < array.length; i ++){
            for(int j=i; j< array.length; j ++){
                if(array[i]> array[j]){
                    swap(array, i,j);
                }
            }
        }
    }

    public void printIntArray(int[] numberArray){
        for (int i = 0; i < numberArray.length; i++){
            System.out.println("["+i+ "]  = "+numberArray[i]);
        }
    }

}
