package Firstclass.Sets;

import java.util.HashSet;
import java.util.Arrays;

public class HashSetEcx {
    public static void main(String[] args){
        //int[] array = {1,2,2,3,5,6,7,3,7,8,10,10};
        Integer[] array = {1,2,2,3,5,6,7,3,7,8,10,10};
        HashSetEcx hashSetEcx = new HashSetEcx();

        Integer[] result = hashSetEcx.removeDuplicatesUpdated(array);
        System.out.println("before "+ Arrays.toString(array));
        System.out.println("after "+ Arrays.toString(result));
    }
    /*
     * 1. method accepts array of int and returns array of int
     * 2. define hashset add elements of array into it to remove duplicates
     * 3. define an array to contain final result(numbers duplicates removed)
     * 4. populate it with the elements from hashset
     * 5. return it
     * */
//    public int[] removeDuplicates(int[] arr){ // 1.return array int[]
//
//        Set<Integer> noDupSet = new HashSet<>();// 2.define hashset
//
//        for (int i = 0; i< arr.length; i++){// 2. iterate all array and put to set
//            noDupSet.add(arr[i]);
//        }
//
//        int[] finalArray = new int[noDupSet.size()]; //declare array with size (bc arr.length has duplicates, so hashset)
//
//        int counter = 0;// change index of array create counter
//
//        for (Integer element: noDupSet){ // populate to get each element of noDupSet
//            finalArray[counter] = element;
//            counter ++;                   // put it to new array which are removed
//        }
//        return finalArray;
//    }


    public Integer[] removeDuplicatesUpdated(Integer[] arr){
        HashSet<Integer> noDupSet = new HashSet<>(Arrays.asList(arr));
        return noDupSet.toArray(new Integer[0]); // new Integer [arr.length];-->gives last elements as null
    }


}


