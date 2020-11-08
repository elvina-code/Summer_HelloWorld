package Exercises.StaticAndNonStaticMethod;

public class Library {
    public static void main(String[] args) {
        Book book = new Book();

        Book.getPublish();



        book.getTitle();

        Library library = new Library();
        library.sayHello();


    }
    public void sayHello(){
        System.out.println("Hello");
    }

}
