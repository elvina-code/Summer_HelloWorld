package HomeWork;

public class Assigment3 {
    /* Write a Java program that prints its multiplication table up to 10.
Test Data:
Declare an integer number1 as 8 and declare another 10 different variables from 1 to 10 to calculate below multiplication table.
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80

     */

    public static void main(String[] args) {
        int num = 8;
        int a =0;

        while (a < 10){
            a++;
            System.out.println(num + " * " + a + " = " +(num * a));
        }





    }
}