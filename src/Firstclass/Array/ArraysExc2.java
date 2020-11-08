package Firstclass.Array;

public class ArraysExc2 {
    public static void main(String[] args) {
        int[] array ={1,2,3,4};
        int num =lengthOfArray(array);
        System.out.println("The size of array is " + num);
        System.out.println("  " +evenOddLength(array));

    }
    public static int lengthOfArray(int [] num){

        return num.length;
    }


    public static boolean evenOddLength(int [] array){
        if(array.length % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }
//    public static boolean evenOddLength (int [] array){
//
//        return array.length ==0;
//    }
}
