package Exercises;

import java.util.Arrays;

public class MultiDimenArrPresentation {
    public static void main(String[] args) {
////        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
////        int x = myNumbers[0][2];
////        System.out.println(x);
////
////
////        for (int i = 0; i < myNumbers.length; ++i) {
////            for (int j = 0; j < myNumbers[i].length; ++j) {
////                System.out.println(myNumbers[i][j]);
////            }
////        }
////
//        int[] intArray; //1) Declaring your Array
//        intArray = new int[7]; //2) Constructing an Array and Defines that intArray will store 7 integer values
//
////        int intArray2[] = new int[7]; // Declaration and Construction combined
////
////        intArray[0] = 1; // Assigns an integer value 1 to the first element 0 of the array
////        intArray[1] = 2; // Assigns an integer value 2 to the second element 1 of the array
////
//        for (int i= 0; i< 7; i++) {
//            intArray[i] = i+1; //The variable i is initialized to 0 and runs up until the length of the array minus 1.
//        }
//        for (int i = 0; i < 7; i++) {
//            System.out.println("array[" + i + "] = " + intArray[i]);
//        }
//        System.out.println("Length of Array  =  " + intArray.length);
////        intArray[8] =10;
//
//        ///////////////////////////////////////////////////////////////
//
////        This example first creates an array of String references.
////        When you first create an array of object references, each of the cells in the array points to null - no object.
//        String[] stringArray = new String[10];
////        The first of the two for loops iterate through the String array, creates a String and makes the cell reference that String.
//        for(int i=0; i < stringArray.length; i++) {
//            stringArray[i] = "String # " + i;
//        }
////        The second of the two for loops iterate through the String array and prints out all of the strings that the cells reference.
//        for(int i=0; i < stringArray.length; i++) {
//            System.out.println( stringArray[i] );
//        }
//
//
//        ////////////////////////////////////////////////////////////
////        int[] intArray = new int[10];
////        for(int i=0; i < intArray.length; i++) {
////            intArray[i] = i;
////        }
////        for(int i=0; i < intArray.length; i++) {
////            System.out.println( intArray[i] );
////        }


        ////////////////////////////////////////////////////////////////
//        int[] ints   = new int[10];
//
//        int insertIndex = 4;
//        int newValue    = 123;

//move elements below insertion point.
//        for(int i=ints.length-1; i > insertIndex; i--){
//            ints[i] = ints[i-1];
//        }
//        for(int i=0; i< ints.length-1; i++){
//            ints[i] = ints[i];
//        }
//
////insert new value
//        ints[insertIndex] = newValue;
//
//        System.out.println(Arrays.toString(ints));

///////////////////////////////////////////////////////////////////////////
        int[] ints2   = new int[10];

        insertIntoArray(ints2, 0, 10);
        insertIntoArray(ints2, 1, 23);
        insertIntoArray(ints2, 9, 67);


///////////////////////////////////////////////////////////////////////////////////

        Account obj[] = new Account[2] ;// The line of code exactly creates an array of two reference variables as shown below
        obj[0] = new Account(); //This step creates objects and assigns them to the reference variable array as shown below
        obj[1] = new Account();//This step creates objects and assigns them to the reference variable array as shown below

        obj[0].setData(1,2);
        obj[1].setData(3,4);
        System.out.println("For Array Element 0");
        obj[0].showData();
        System.out.println("For Array Element 1");
        obj[1].showData();
    }

    private static void insertIntoArray(int[] array, int insertIndex, int newValue) {
        for(int i =0; i< array.length-1; i++){
            array[i] = array[i];
        }
//insert new value
        array[insertIndex] = newValue;

        System.out.println(Arrays.toString(array));

    }
}
class Account{
    int a;
    int b;
    public void setData(int c,int d){
        a=c;
        b=d;
    }
    public void showData(){
        System.out.println("Value of a ="+a);
        System.out.println("Value of b ="+b);
    }


}

