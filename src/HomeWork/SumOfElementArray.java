package HomeWork;
//Can you find sum of all elements of array by using for loop?
//
//    Example: 3+1+2+5+4=15

public class SumOfElementArray {
    public static void main(String[] args) {

        int arr[]={3, 1, 2, 5, 4};

        int sum =0;

        for(int i =0; i <arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum of elements " + sum);

    }



}
