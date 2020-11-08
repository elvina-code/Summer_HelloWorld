package Exercises;
//Finish the following method to return the sum of all of the non-negative values in the passed array.
public class Test11 {

        public static int getSumNonNeg(int[] arr)
        {
            int sum =0;
//            for(int i =0; i <arr.length; i++){
//                if(arr[i]>=0)
//                sum +=arr[i];

            for(int value: arr){
                if(value >=0)
                    sum +=value;
            }
            return sum;

        }
        public static void main(String[] args)
        {
            int[] a1 = {1, 2, 5, 3, -1, -20};
            System.out.println("The code should print 11 " +
                    "and your answer is: " + getSumNonNeg(a1));
        }
    }

