package Exercises.StudentMentor;

import java.util.Scanner;
import java.util.Stack;

public class YuriiTask5 {

    /*Create Stack of Integers
    -create loop
    -get letter
    -check stack if empty then add this letter to stack
    -if not stack empty then go to else and get with peek letter
    -then in else create if statement and compare (letter ==‘)’ && stack==‘(’ and repeat for every parenthesis you need.
    -if it is true then you remove with pop from stack
    -if it is false then you add letter to stack
    -return check if stack isEmpty*/

    public static boolean isBalanced(String str) {
//{}()[]  {()} [{()}]
        Stack<Character> stack = new Stack<>();
        //last in and first out, no index
        //isEmpty() return boolean
        //push() - like add to the end
        //peek() - like get but it takes last element
        //pop() - like get but it takes the last element and delete it
//[}{
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);//
            if (stack.isEmpty()) {
                stack.push(ch);  //[{
            } else {
                char last = stack.peek();//(
                if ((last == '{' && ch == '}') || (last == '(' && ch == ')') || (last == '[' && ch == ']')) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        while (sc.hasNext()) {
//            StringRemoveWord input = sc.next();
//
//        }


    }
}
