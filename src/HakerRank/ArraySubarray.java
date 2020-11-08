package HakerRank;

import java.util.Scanner;

public class ArraySubarray {
    public static void main(String[] args) {
        int[] a = {1, -2, 4, -5, 1}; // calculate subarrays
        int counter =0; // calculate sum negative arrays
        for (int i = 0; i <a.length; i++) {
            for (int j = i; j <a.length; j++) {
                System.out.println("starts at " +i + "ends at "+j);
            printSubArray(a,i,j);


            int subArraySum = calculate1DArray(a,i,j);//calculate sum negative arrays
                if(subArraySum < 0){
                    counter++;
                    System.out.println("It is negative");
                }

                System.out.println();
                System.out.println("the sum of arrays " +calculate1DArray(a,i,j));

            }

        }
        System.out.println("the number of negative subarrays " + counter);

    }
    public static void printSubArray(int[] array, int start, int end){ // calculate subarrays
        for(int i=start; i<= end; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static int calculate1DArray(int [] array, int start, int end){ // calculate the sum of subarrays
        int sum=0;
        for(int i=start; i <= end; i++)
            sum+=array[i];
        return sum;

    }

}
