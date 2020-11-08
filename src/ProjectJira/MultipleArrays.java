package ProjectJira;

import com.sun.org.apache.xerces.internal.xinclude.MultipleScopeNamespaceSupport;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleArrays {
        /*
        Create a function that takes two numbers as arguments (num, length) and returns
        an array of multiples of num up to length.
        Examples: arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]
        arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]

         */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter number");
            int num1 = scan.nextInt();
            System.out.println("Please enter number of length");
            int num2 = scan.nextInt();

            MultipleArrays multipleArrays = new MultipleArrays();
            multipleArrays.arrayMult(num1,num2);

        }
        public void arrayMult(int num, int length){
            int[] arr=new int[length];
            for (int i=0;i<length;i++){
                arr[i]=num*(i+1);
            }
            System.out.println(Arrays.toString(arr));
        }
    }


