package ProjectJira;

import java.util.Arrays;
import java.util.Scanner;
/*Given two arrays of ints sorted in increasing order, outer and inner,
 return true if all of the numbers in inner appear in outer.
 The best solution makes only a single "linear" pass of both arrays,
 taking advantage of the fact that both arrays are already in sorted order.

linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true*/

public class InnerOuterNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your length of the array?");
        System.out.println("Enter your element for array");
        int a = scanner.nextInt();

        int[] outer = {1, 2, 4, 6};
        int[] inner = {2,4};
        System.out.println(Arrays.toString(outer) + " and" + Arrays.toString(inner) + " is " + linearIn(outer, inner));
    }

    public static boolean linearIn(int[] outer, int[] inner) {

        int p = 0;//pointer for inner array

        if (inner.length == 0) return true;//no inner array

        for (int i = 0; i < outer.length; i++) {//iterating outer array

            if (inner[p] == outer[i]) {//found a inner array element in outer
                p++;//increment pointer of inner array
            }
            if (p == inner.length) {//if everyone in inner array is found
                return true;
            }
        }
        return false;

    }


}


