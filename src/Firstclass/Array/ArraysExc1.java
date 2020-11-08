package Firstclass.Array;

import java.util.Scanner;

public class ArraysExc1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String searchBook = userInput.next();


        String[] bookShelf = {"book1", "book2", "book3", "book4"};
        boolean bookFound = false;

        for (int i = 0; i < bookShelf.length; i++) {
            if (searchBook.equals(bookShelf[i])) {
                System.out.println("Bingo , I found the book, the book is in " + i);
                bookFound = true;
                break;

                //}else{
                //System.out.println("Didn't find a book"); wont work properly

            }
        }
            if (bookFound == false) {
                System.out.println("Sorry, there is no such book!");
            }
        }
    }


