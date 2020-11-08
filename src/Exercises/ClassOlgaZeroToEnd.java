package Exercises;
import java.util.Arrays;

public class ClassOlgaZeroToEnd {
    public static void main(String [] args){
//        given array return array in a order with all zero at the end.
        int [] array = {3,0,1,5,0,3,2};
        System.out.println(Arrays.toString(zeroEnd(array)));
    }
    public static int[] zeroEnd (int [] num){
        int[] result =new int [num.length];// fixsize, immutable
//        System.out.println(result.length);
//        System.out.println(Arrays.toString(result));
        int index =0;// new counter of index if the created array
        for(int i=0; i < num.length; i++){
            if(num[i] != 0){
                result [index++] = num [i];

            }
        }
        return result;// return values

    }
}
