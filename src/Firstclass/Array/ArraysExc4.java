package Firstclass.Array;

import java.util.Arrays;

public class ArraysExc4 {
    public static void main(String[] args) {
        int [] inputArr = {0,10,43,56};//
        // To insert values to it, we can use an array literal - place the values in a comma-separated list, inside curly braces
        int counter =0;//
        for(int i = 0; i<inputArr.length; i++){//
            if(inputArr[i] !=0){
                inputArr[counter] =inputArr[i];
                counter ++;
            }
        }
        while(counter< inputArr.length){
            inputArr[counter] = 0;
            counter++;

        }
        System.out.println(Arrays.toString(inputArr));
    }
}
