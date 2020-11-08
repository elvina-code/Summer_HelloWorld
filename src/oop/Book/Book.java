package oop.Book;

public class Book {
//  instance variables
    private int price;
    private String name;

    public static  String className(){ // static method that can in BookDemo1
        return "I am a static method from Book class";
    }
// contructor:  constructor name must match the class name, and it cannot have a return type (like void).
//    constructor is called when the object is created.
//    All classes have constructors by default: if you do not create a class constructor yourself,
//    Java creates one for you. However, then you are not able to set initial values for object attributes.

    public Book(int price, String name) {
        this.price = price;
        this.name = name;
    }

    // getter and setter
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) { // void method
//        this.price = price;
        System.out.println("the price : " +price);
    }

    public String getName() {
        return name;
    }
//
    public void setName(String name) { // void method
        System.out.println("the book name :" + name);

//        this.name = name;
    }

    public int getPrice(String buyerType){
        if (buyerType == "student")
            return this.price * 50 /100;
        else
            return price;
    }
}
