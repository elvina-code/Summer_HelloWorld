package oop.Book;

import oop.Book.Book;

public class BookDemo {
    public static void main(String[] args){
        Book book1 = new Book(12, " red");

        System.out.println(book1.getPrice()+ book1.getName());

        System.out.println(book1.getPrice("regular" ));
        System.out.println(book1.getPrice("student" ));


        book1.setPrice(20); // take from void method The dot (.) is used to access the object's attributes and methods.
        book1.setName("OCA"); // take from void method


    }
}
