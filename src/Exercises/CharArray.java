package Exercises;

public class CharArray {
    public static void main(String[] args) {

        char chars[] = {'a', 'd', 'e', 'i', 'k', 'n', 'V', 'v'};
        char moves[] = {6, 5, 4, 3, 10, 4, 5, 3, 5, 3, 1, 7};
        int j = 0;
        for (char move : moves) {
            j += move;
            j %= chars.length;
            System.out.print(chars[j]);



        }

        int [] numbers = {2, -9, 0, 5, 12, -25, 22,9, 8,12};
        int sum = 0;
        Double average;

        for(int number: numbers){
            sum +=number;
        }
        int arrayLength = numbers.length;
//        average = Double.valueOf(sum/ arrayLength); //gives 36/10 average --->3.0
        average =(double) sum / (double)arrayLength; // gives exact average 36/10 -->3.6 called type casting
        System.out.println("sum "+ sum);
        System.out.println("average "+ average);
    }
}


