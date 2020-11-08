package HomeWork;

import java.util.Scanner;

public class ReverseMethod {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your String:");

        String word =userInput.next();

        StringBuilder stb = new StringBuilder();
        stb.reverse();

        stb.append(word);

        System.out.println(stb);
        System.out.println("Reverse of your String is  "+stb.reverse());


        String s ="oxoxoxox";
        System.out.println(s.replace('x','X'));

        System.out.println("abc ".trim()+"abc"); // deletes space after abc
        System.out.println(" a b c ".trim()); // deletes space in the beginning and the end


        String name = "Bob";
        String modifiedString = helloName(name);
        System.out.println(modifiedString);


        }
        public static String helloName(String name){

            return "Hello " + name+ "!";

        }


    }


