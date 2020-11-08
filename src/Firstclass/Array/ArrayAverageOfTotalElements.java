package Firstclass.Array;
//Finish the method getAverage to calculate and return the average of all of the values in the array.

//average = sumofelements/number of elements

public class ArrayAverageOfTotalElements {

        public static double getAverage(int[] arr)
        {
            int sum =0;
//            for(int i =0; i < arr.length; i++){
//                sum +=arr[i];
//            }
            for(int element: arr){
                sum +=element;
            }

            return sum/arr.length;

        }
        public static void main(String[] args)
        {
            int[] arr = {20, 3, 18, 55, 4};
            System.out.println(getAverage(arr));;
        }
}
