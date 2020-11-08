package Firstclass.Array;
import HakerRank.Array;

import java.util.Arrays;

public class Rearange3To4 {

    //Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4.
    // Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's,
    // every 3 has a number after it that is not a 3 or 4, and a 3 appears in the array before any 4.
//        fix34({1, 3, 1, 4, 4, 3, 1}) → {1, 3, 4, 1, 1, 3, 4}

    public static void main(String[] args) {
        int arr [] ={1, 3, 1, 4, 4, 3, 1 };

        System.out.println(Arrays.toString(arr));
        System.out.println(fix34(arr).toString());
    }
        public static  int [] fix34 ( int[] nums){

        int j = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i + 1] != 4) {
                for (; nums[j] != 4; j++) ;
                nums[j] = nums[i + 1];
                nums[i + 1] = 4;
            }
        }
            return nums;
    }


    }

