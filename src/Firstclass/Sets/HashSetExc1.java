package Firstclass.Sets;

import java.util.Arrays;
import java.util.HashSet;
//Write a Java program to compare two arrays : all the methods accepts two arrays of Integer as an input, and return single Array of Integer
//1. method which returns common elements of two arrays -->  [1,2,3,1,2,5,7]  [2,3,7,8,1,1,10]  result should be [1,2,3,7]
//2. method which returns difference of two arrays  -->  [1,2,3,1,2,5,7]  [2,3,7,8,1,1,10]  result should be [8,10,5]
//3. method which return union of elements of two arrays  --> [1,2,3,1,2,5,7]  [2,3,7,8,1,1,10]  result should be [1,2,3,5,7,8,10]

public class HashSetExc1 {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 1, 2, 5, 7};
        Integer[] array2 = {2, 3, 7, 8, 1, 1, 10};

        HashSetExc1 hashSetExc1 = new HashSetExc1();

        Integer[] result = hashSetExc1.removeDuplicatesUpdated(array1);
        Integer[] result2 = hashSetExc1.removeDuplicatesUpdated(array2);
        System.out.println("array 1 " + Arrays.toString(result));
        System.out.println("array 2 " + Arrays.toString(result2));


        System.out.println("Common elements" + Arrays.toString(hashSetExc1.findcommonElements(array1, array2)));// utility method
        System.out.println("Different elements" + Arrays.toString(hashSetExc1.findDifferntElements(array1, array2)));
        System.out.println("Union elements" + Arrays.toString(hashSetExc1.findUnionElements(array1, array2)));

    }

    public Integer[] removeDuplicatesUpdated(Integer[] arr) {
        HashSet<Integer> noDupSet = new HashSet<>(Arrays.asList(arr));
        return noDupSet.toArray(new Integer[0]);
    }

    public Integer[] findcommonElements(Integer[] arr1, Integer[] arr2) { // collection doesnt work with primitive data type so wrapper class
        HashSet<Integer> numberSet1 = new HashSet(Arrays.asList(arr1)); // set for first array
        HashSet<Integer> numberSet2 = new HashSet(Arrays.asList(arr2)); // set for second array

        numberSet1.retainAll(numberSet2);//leave only common elements
        return numberSet1.toArray(new Integer[0]);// return an array (array must have size, jvm finds the size and
    }

    public Integer[] findDifferntElements(Integer[] arr1, Integer[] arr2) {
        HashSet<Integer> numberSet1 = new HashSet(Arrays.asList(arr1));
        HashSet<Integer> numberSet2 = new HashSet(Arrays.asList(arr2));
        HashSet<Integer> tempNumber = (HashSet<Integer>) numberSet1.clone();// numberSet1.clone we taking same it is

        numberSet1.removeAll(numberSet2);
        numberSet2.removeAll(tempNumber);

        numberSet1.addAll(numberSet2);

//        return numberSet1.toArray(new Integer[0]);
        return numberSet1.toArray(new Integer[numberSet1.size()]);


    }

    public Integer[] findUnionElements(Integer[] arr1, Integer[] arr2) {
        HashSet<Integer> numberSet1 = new HashSet(Arrays.asList(arr1));
        HashSet<Integer> numberSet2 = new HashSet(Arrays.asList(arr2));

        numberSet1.addAll(numberSet2);
//        return numberSet1.toArray(new Integer[numberSet1.size()]);
        return numberSet1.toArray(new Integer[0]);

    }
}
