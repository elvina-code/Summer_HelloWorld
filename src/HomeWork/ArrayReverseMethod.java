package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReverseMethod {
//Write a method called reverse(), which takes an array of int and reverse its contents.
// For example, the reverse of [1,2,3,4] is [4,3,2,1]. The method's signature is as follows:
//public static void reverse(int[] array)

    public static void main(String[] args) {

        //Choise #1 swap

        Integer[] array = {1, 2, 3, 4, 5};
        System.out.println("array before reverse: " + Arrays.toString(array) );

        for(int i=0; i<array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = temp;
        }

        System.out.println("array after reverse: " + Arrays.toString(array) );

//        choise # add and move

        List numbers = new ArrayList(Arrays.asList("1", "2", "3"));
        System.out.println("Before Reversing: " + numbers);

        for (int i = 0, j = numbers.size() - 1; i < j; i++) {
            numbers.add(i, numbers.remove(j));
        }

        System.out.println("After Reversing: " + numbers);

        //Choise #2 for loop
        //print array starting from first element
        System.out.println("Original Array:");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + "  ");

        System.out.println();

        //print array starting from last element
        System.out.println("Original Array printed in reverse order:");
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + "  ");
        System.out.println();


        //Choise #3 using ArrayList
        Integer[] myArray = {1, 3, 5, 7, 9};
        System.out.println("Original Array:" + Arrays.asList(myArray));
        reverse(myArray);


    }

    /*function reverses the elements of the array*/
    public static void reverse(Integer myArray[]) {
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reversed Array:" + Arrays.asList(myArray));
    }
    /*swap the first elemnt of array with the last element; second element with second last and so on*/





}
