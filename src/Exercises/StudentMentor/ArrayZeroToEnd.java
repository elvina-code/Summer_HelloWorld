package Exercises.StudentMentor;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayZeroToEnd {

    public static void main(String[] args) {


        ArrayZeroToEnd z = new ArrayZeroToEnd();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of integers that will be stored in an Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements for an Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(z.zerosEnd(arr)));

    }

    public int[] zerosEnd(int[] arr) {
        int[] arr2 = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr2[index++] = arr[i];
            }
        }
        return arr2;
    }

}
