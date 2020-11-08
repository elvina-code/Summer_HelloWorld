package Exercises;

import java.util.Arrays;

public class MultidimenExc {
    public static void main(String[] args) {
        int [] [] myArray = new int [4][2];
        int [] arrZero= new int[2];
        arrZero[0]=9;
        arrZero[1]=2;
        myArray [0] = arrZero;
        System.out.println(Arrays.toString(myArray[0]));
        System.out.println(Arrays.toString(arrZero));

        int [] arrOne = new int [2];
        arrOne[0] = 1;
        arrOne[1]=5;
        myArray[1] =arrOne;
//        System.out.println(Arrays.toString(myArray[1]));
        System.out.println(Arrays.toString(arrOne));

        int [] arrTwo = new int [2];
        arrTwo[0] = 3;
        arrTwo[1]=56;
        myArray[2] =arrTwo;
//        System.out.println(Arrays.toString(myArray[2]));
        System.out.println(Arrays.toString(arrTwo));

        int [] arrThree = new int [2];
        arrThree[0] = -3;
        arrThree[1]=-6;
        myArray[3] =arrThree;
//        System.out.println(Arrays.toString(myArray[2]));
        System.out.println(Arrays.toString(arrThree));

        int [] []  bigTable = new int [6][5];
        for(int row = 0; row < bigTable.length; row++){
            for(int col = 0; col < bigTable[row].length; col++){
                System.out.print(bigTable[row][col] +" | ");

            }
            System.out.println();
            System.out.println("--------------------");

        }
    }
}
