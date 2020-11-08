package Firstclass.Array;

import java.util.Arrays;

public class ArraysExc3 {
    public static void main(String[] args) {
        int [] numbers = new int [10];
        for(int i = 0; i <numbers.length; i++){
            numbers[i] = i+5;
            System.out.println("["+i+ "]  = " + numbers[2]);
        }

        int [] number = {10,33,42,45,22,55,10};
        for(int i =0; i < number.length; i ++){
            System.out.println("["+i+ "]  = "+number[i]);
        }

        double [] prices = {10.99, 23.99, 44.5, 1.99, 1.98};
        double [] pricesDuplicate = prices.clone(); // if we need to save original numbers before sorting /////prices; //Arrays.copyOf(prices, prices.length);

        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(pricesDuplicate));
        Arrays.sort(prices);

        System.out.println(prices); // memory location. hashcode

        System.out.println(Arrays.toString(prices) + "sorted ");

        System.out.println(Arrays.toString(pricesDuplicate));

        // Arrays sort (answer)  == no implementation to sort boolean!!!

        String[] bookShelf = {"book2", "book32", "Book3", "1book4"};
        System.out.println(Arrays.toString(bookShelf));
        bookShelf[1]= bookShelf[1].toUpperCase();
        System.out.println(bookShelf[1]);

        Arrays.sort(bookShelf);
        System.out.println(Arrays.toString(bookShelf));

        // first number , uppercase, alphabet; reference to ASCII table

        int [] shoeSize= {1,4,6,3,9};
        Arrays.sort(shoeSize);
        System.out.println(Arrays.toString(shoeSize));
        int index = Arrays.binarySearch(shoeSize,3); // binarySearch return type int index
        System.out.println(index);

        String[] products = {"banana","apple","pineapple"};
        Arrays.sort(products);
        System.out.println(Arrays.toString(products));
        System.out.println(Arrays.binarySearch(products, 1));// provide array first you searching , then the target value you looking for
        // it the array is sorted and the target value is present in the array method return the index of the value(in the sorted array)
        // it the array is sorted and the target value is NOT present in the array method return the index of the value(negative index where it would be -1)
        // if we binary search without sorting it will undefined index  value(any number from comp)

    }

}
