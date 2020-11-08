package Exercises;

import java.util.Arrays;

public class ArrayPresentation {
    public static void main(String[] args) {
//        ArrayPresentation arrayPresentation = new ArrayPresentation();

        int[] arr = new int[13];
        arr[9] = 145;
        arr[10] = 12;
        arr[11] = 38;
        arr[12] = 76;

        System.out.println(Arrays.toString(arr));

        int removeIndex = 10;
//        for (int i = removeIndex; i < arr.length - 1; i++) {
//            arr[i] = arr[i + 1];
//        }
//        System.out.println(Arrays.toString(arr));

//      arrayPresentation.removeFromArray(arr,10);
//        System.out.println(Arrays.toString(arr));
        ArrayPresentation.removeFromArray(arr,10);
        System.out.println(Arrays.toString(arr));

    }
    public static   void  removeFromArray(int[] array, int removeIndex){

        for(int i = removeIndex; i < array.length -1; i++){
            array[i] = array[i + 1];
        }

    }
//    It removes the element by shifting all elements below index 10 one position up in the array.
//    After the removal, the last element in the array will exist twice.
//    Both in the last and second last element.
}
