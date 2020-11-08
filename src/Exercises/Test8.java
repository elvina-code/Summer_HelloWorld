package Exercises;
//Finish the following method getSum to return the sum of all values in the passed array.
public class Test8 {
        public static int getSum(int[] arr)
        {
            int sum =0;
 //           int counter =0;
//            while(counter<arr.length){
//            sum += arr[counter];
//            counter++;
//            }
            for(int i =0; i <arr.length; i++){
                sum +=arr[i];
            }
            return sum;

        }


    public static void main(String[] args)
    {
        int[] a1 = {1, 2, 5, 3};
        System.out.println("It should print 11 " +
                " and your answer is: " + getSum(a1));
    }
}