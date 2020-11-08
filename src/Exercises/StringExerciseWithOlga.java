package Exercises;

import java.util.Arrays;

public class StringExerciseWithOlga {
    public static void main(String[] args) {
        /*String is a sequence of characters that is considered to be an object in Java
        Both StringBuilder and StringBuffer has the same approach of reversing a String in Java.
        But, StringBuilder is preferred as it is not synchronized and is faster than StringBuffer.
         */

         String name = "Zalkar";
//        StringBuilder str= new StringBuilder(name);
//        System.out.println(str.reverse());

        String sentence = "Zalkar loves Java !";
        String[] sentences = sentence.split(" ");
//        int lastword = sentence.lastIndexOf(" ");
//        System.out.println(sentence.substring(0, lastword));

        String[] array = sentence.split(" ");// "" will print each character
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) { // delete last word
            System.out.print(array[i] + " ");// print
        }
        System.out.println();
//        System.out.println(sentence.replace("Zalkar", "Elvina"));

        String [] names = name.split(" ");
        System.out.println(Arrays.toString(names));// [Zalkar]
        for(String w: names){
            System.out.println(w);// Zalkar
        }
        for(int i =0; i< sentences.length-2; i++){// delete last two words
            System.out.print(sentences[i]+ " ");

        }
        System.out.println();

        String s = "Welcome to Edureka"; // Note that string is immutable in Java
        s = rev(s);
        System.out.println("Result after reversing a string is : " + s);

    }
        // Function to reverse a string in Java using StringBuilder
        public static String rev(String s) {
            return new StringBuilder(s).reverse().toString();
        }
    }

