package Firstclass.Array;

import java.util.Scanner;

public class ArraysSumAndBooleanBooks {
    public static void main(String[] args) {
        int[] numbers = {7,8,9,10,11};
        int sum = 0;
//        for(int i =0; i< numbers.length; i++){
//            sum = sum + numbers[i];
//        }

        int b = numbers.length - 1;

        while (b >= 0){
            sum += numbers[b];
            b--;
        }

        printIntArray(numbers);
        System.out.println("The sum is "+sum);

        Scanner userInput = new Scanner(System.in);
        String searchBook = userInput.next();

        String[] bookShelf = {"book1", "book2", "book3", "book4"};//We have now declared a variable that holds an array of strings.
        boolean bookFound = false;
        for (int i = 0; i < bookShelf.length; i++){
            if (searchBook.equals(bookShelf[i])){
                System.out.println("Bingo , I found the book, the book is in "+i);
                bookFound = true;
                break;
            }
        }
         if (bookFound == false) {
             System.out.println("Sorry, there is no such book!");
         }

    }

    public static void printIntArray(int[] numberArray){
        for (int i = 0; i < numberArray.length; i++){
            System.out.println("["+i+ "]  = "+numberArray[i]);
        }
    }



}
