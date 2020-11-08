package oop.BookStore;

public class BookStoreDemo {
/*
    * Write a Java class Author with following features:
        Instance variables :
            firstName for the author’s first name of type String.
            lastName for the author’s last name of type String.
        Constructor:
            public Author (String firstName, String lastName):
            * A constructor with parameters, it creates the Author object by setting the two fields to the passed values.
        Instance methods:
            public void setFirstName (String firstName): Used to set the first name of author.
            public void setLastName (String lastName): Used to set the last name of author.
            public String getFirstName(): This method returns the first name of the author.
            public String getLastName(): This method returns the last name of the author.
            public String toString(): This method printed out author’s name to the screen
        Write a Java class Book with following features:
            Instance variables :
                title for the title of book of type String.
                author for the author’s name of type String.
                price for the book price of type double.
        Constructor:
            public Book (String title, Author name, double price): A constructor with parameters, it creates the Author object by setting the the fields to the passed values.
        Instance methods:
            public void setTitle(String title): Used to set the title of book.
            public void setAuthor(String author): Used to set the name of author of book.
            public void setPrice(double price): Used to set the price of book.
            public String getTitle(): This method returns the title of book.
            public String getAuthor(): This method returns the author’s name of book.
            public String toString(): This method printed out book’s details to the screen
        Write a separate class BookDemo with a main() method creates
        * a Book titled “Developing Java Software” with authors Russel Winderand price 79.75.
        * Prints the Book’s string representation to standard output (using System.out.println).
* */

    public static void main(String[] args) {

        Author author = new Author("Russell", "Winderand");

        BookStore bookStore = new BookStore("Developing Java Software", author, 79.95);

        System.out.println(bookStore.toString());

    }
}
