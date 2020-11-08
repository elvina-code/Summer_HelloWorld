package Exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPresentation2 {
    public static void main(String[] args) {

        // Declaring the ArrayList with initial size 5
//        ArrayList<Integer> arrString = new ArrayList<Integer>(5);
//
//
//        // Appending new elements at the end of the list
//        for (int i = 1; i <= 5; i++)
//            arrString.add(i);
//
//        // Printing elements
//        System.out.println(arrString);
//
//        // Remove element at index 3
//        arrString.remove(3);
//
//        // Displaying the ArrayList after deletion
//        System.out.println(arrString);
//
//        // Printing elements one by one
//        for (int i = 0; i < arrString.size(); i++)
//            System.out.print(arrString.get(i) + " ");
//
//        System.out.println();

        ////////////////////////////////////////////////
//        ArrayList<String> arrStr = new ArrayList<>();
//
//        arrStr.add("Geeks");
//        arrStr.add("Before");
//        arrStr.add("Wuff");
//        // Using the Get method and the
//        // for loop
//        for (int i = 0; i < arrStr.size(); i++) {
//
//            System.out.print(arrStr.get(i) + " ");
//        }
//
//        System.out.println();
//
//        // Using the for each loop
//        for (String str : arrStr) {
//            System.out.print(str + " ");
//        }

//            System.out.println("Initial ArrayList " + arrStr);
//
//            arrStr.set(1, "After");
//
//            System.out.println("Updated ArrayList " + arrStr);
//
//            arrStr.remove(1);
//
//            System.out.println(
//                "After the Index Removal " + arrStr);
//
//            arrStr.remove("Geeks");
//
//            System.out.println(
//                "After the Object Removal " + arrStr);
//        System.out.println();
//
//        ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>(3);
//
//        // Create n lists one by one and append to the
//        // master list (ArrayList of ArrayList)
//        ArrayList<Integer> a1 = new ArrayList<Integer>();
//        a1.add(1);
//        a1.add(2);
//        aList.add(a1);
//
//        ArrayList<Integer> a2 = new ArrayList<Integer>();
//        a2.add(5);
//        aList.add(a2);
//
//        ArrayList<Integer> a3 = new ArrayList<Integer>();
//        a3.add(10);
//        a3.add(20);
//        a3.add(30);
//        aList.add(a3);

//        for (int i = 0; i < aList.size(); i++) {
//            for (int j = 0; j < aList.get(i).size(); j++) {
//                System.out.print(aList.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }
        String[] arrString = new String[5];
        arrString[0] = "This";
        arrString[1] = "is";
        arrString[2] = "a";
        arrString[3] = "string";
        arrString[4] = "array";

        Arrays.sort(arrString);
        for (int i = 0; i < arrString.length; i++) {
            System.out.println(arrString[i]);
        }

        int[] aryNums = {24, 6, 47, 35, 2, 14};

        int i;
        int arrayTotal = 0;
        int average = 0;

        for (i = 0; i < aryNums.length; i++) {

            arrayTotal = arrayTotal + aryNums[i];

        }

        average = arrayTotal / aryNums.length;
        System.out.println("total: " + average);

        Arrays.sort(aryNums);
        int lastArrayNumber = aryNums.length - 1;
        System.out.println("Highest Number: " + aryNums[lastArrayNumber]);

        int oddNum = 0;
        for (i = 0; i < aryNums.length; i++) {

            oddNum = aryNums[i] % 2;

            if (oddNum == 1) {

                System.out.println("odd number = " + aryNums[i]);

            }

        }
        int[] a = { 1, 2, 3 };
        int[] b = { 1, 2, 3 };
        System.out.println(a == b);

        int myArr[] = new int [7];

        System.out.println(Arrays.toString(myArr));
    }
}





