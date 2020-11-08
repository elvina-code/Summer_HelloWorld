package Exercises;

public class Test1 {
    public static  void main(String[] args) {
        if(args [0].equals("hello")?  false: true){
            System.out.println("success");
        }else{
            System.out.println("failure");
        }
    }
}
    /*Answer is B. ” Failure”.
        Explanation:
        We have command in terminal:
        javac Test.Java
        Java Test Hello
        When you use commands in terminal and call your class, and any parameters you enter in teminal it will go in main class parameter.
        When we call command: java Test Hello - our parameter is “Hello”.
        Inside if statement we have true, but according to  ternary condition we will got false and thats why it will go to else and print “Failure”*/