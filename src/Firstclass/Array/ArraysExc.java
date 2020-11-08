package Firstclass.Array;

public class ArraysExc {
    public static void main(String[] args) {
        String [] arr ={"A", "B", "C", "D"};
        for(int i =0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            if(arr[i].equals("C")){
                continue;
            }
            System.out.println("Work done");
            break;
        }

//        int number [] = {7,8,9,10,11};
//
//        int sum =0;
//
//        for(int i =0; i < number.length; i++){
//            sum +=number[i];
//        }//CHOISE 1

        /*int i =0;
        while( i < number.length){
            sum += number[i];
            i++;
        }*/// CHOISE 2

        /*int i = number.length - 1;

        while (i >= 0){
            sum += number[i];
            i--;
        }*/ //CHOISE 3

//        printInArray(number);
//        System.out.println("the sum is " +sum);
    }
    public static void printInArray(int [] numberArray){
        for(int i = 0; i < numberArray.length; i ++){

            //System.out.println("The index is " + i + " the value is " +numberArray[i]);

            System.out.println("["+i+ "]  = "+numberArray[i]);
        }
    }
}
