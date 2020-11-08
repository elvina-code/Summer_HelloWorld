package Trial;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        /* System.out.println("J    a   v     v  a \n" +
                        "   J   a a   v   v  a a \n" +
                        "J  J  aaaaa   V V  aaaaa \n" +
                        " JJ  a     a   V  a     a");

    };*/

        /* int x=1;

        System.out.println(x); //1
        x++;
        System.out.println(x); //2
        ++x;
        System.out.println(x); //3
        int y=3;
        System.out.println(y); //3
        --y: // error
        System.out.println(y);  //2
        y--;
        System.out.println(y);  //1

         */
        /* int a =10, b =5, c =1, result;
        result = a - c++ - ++b;
        System.out.println(result);

         */

        /*int x = 3;
        int y = ++x * 5 / x-- + --x;

        System.out.println("x is " + x);
        System.out.println("y is " + y);

         */

        int counter = 1;
        System.out.println(counter); // Outputs 0
        System.out.println(++counter);// Outputs 1
        System.out.println(counter++); // Outputs 1
        System.out.println(--counter);//Outputs 1
        System.out.println(counter--); // Outputs 0
        System.out.println(counter); // Outputs 0

    }

    public static class FindSmallNumberOf3Num {
        /* Exc1: Write a Java method to find the smallest number among three numbers
    Input the first number: 25
    Input the Second number: 37
    Input the third number: 29
    Expected Output:
    The smallest value is 25.0

         */
        public static void main(String [] args){

            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter 3 numbers:");

            int a = userInput.nextInt();
            int b = userInput.nextInt();
            int c = userInput.nextInt();
            int smallValue;

            System.out.println("The smallest value of 3 "+ smallValue(a,  b, c));


        }
        public static double smallValue(int a, int b, int c){
           if (a < b && a < c){
               return a;
           }else if (b < a && b < c){
               return b;
           }else
               return c;

        }



    }
}
