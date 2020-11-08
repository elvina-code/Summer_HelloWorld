package Firstclass.Array;

public class ArrayIncrement {
    public static void main(String[] args) {
        int[] array = new int[7];

        printIntArray(array);// gives all index 0,1,2,3,4,5,6 as 0

        for (int i = 0; i <= 6; i++) { //6 = array.length
            array[i] = i + 1;
        }
        System.out.println("number of arrays " + array[3]); // give size as 4



        int[] daysOfWeek = {1, 2, 3, 4, 5, 6, 7};
        int a = daysOfWeek[3] + daysOfWeek[2];
        System.out.println("Before incrementing " + daysOfWeek[1]);//2
        daysOfWeek[1]++;
        System.out.println("After incrementing " + daysOfWeek[1]);//3
        printIntArray(daysOfWeek);
        System.out.println(a);
    }

    public static void printIntArray(int[] numberArray) {
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("The index is " + i + " value is " + numberArray[i]); // in index o ->1, index 1->3 and index 2 -> 3 because it's incremented
        }

    }
}
