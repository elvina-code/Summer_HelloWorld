package HakerRank;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] a = new int [n];
        for(int i =0; i< n; i++){
            a[i] =scan.nextInt();
        }
        int counter =0;
        for(int i =0; i < a.length; i++){
            for(int j =i; j <a.length; j++){
                int subArraySum = calculate1DArray(a,i,j);
                if(subArraySum < 0){
                    counter ++;
                }
            }
        }
        System.out.println(counter);
    }
    public static int calculate1DArray(int []array, int start, int end){
        int sum =0;
        for(int i = start; i<= end; i++)
            sum +=array[i];
        return sum;

    }
}
