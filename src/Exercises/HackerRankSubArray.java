package Exercises;

public class HackerRankSubArray {
    public static void main(String[] args) {
        //1. calculate the subarrays.
        //2. calculate the sum of subarrays.
        //3. decide of the sum is negative or positive.

        int [] a = {1,-2, 4, -5, 1};

        int counter = 0;

        for(int i = 0; i < a.length; i++){
            for(int j =i; j < a.length; j ++){
                printSubArray(a,i,j);
                int subArraySum = calculate1DArray(a,i,j);
                    if(subArraySum < 0){
                        counter++;
                    }
                System.out.println("start at " +i+ " ends at " +j);
                System.out.println("The sum of sub array starts at "+i+" ends at "+j+ " = " +calculate1DArray(a, i, j));
            }
        }
        System.out.println("======================================================");
        System.out.println("The number of sub arrays with negative sum is "+counter);
    }

    public static int calculate1DArray(int[] array, int start, int end){
        int sum = 0;
        for(int i = start; i<= end; i ++){
            sum += array[i];
        }
        return sum;
    }
    public static void printSubArray(int[] array, int start, int end){
        for(int i = start; i <= end; i ++){
            System.out.print(array[i] + " ");
        }
    }
}
