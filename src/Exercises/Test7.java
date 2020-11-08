package Exercises;
//Fix the following to print the values in the array arr starting with the value at the last index and
// then backwards to the value at the first index.
public class Test7 {

        public static void main(String[] args)
        {
            int[] arr = {1, 3, 7, 9, 15};
            for (int i = arr.length-1; i >= 0; i--) // -1 and =
                System.out.print(arr[i] + ", ");
        }
    }



