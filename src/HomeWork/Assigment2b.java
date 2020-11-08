package HomeWork;

public class Assigment2b {
    /*Write a Java program to print the result of the following operations.
Test Data:

a. -5 + 8 * 6   // you should declare first data types ==> int  a=-5; int b=8; c=6 ;    int result=a+b*c; System.out.println(result);
b. (55+9) % 9   // try to declare data type first and print out the result
c. 20 + -3*5 / 8    // try to declare data type first and print out the result
d. 5 + 15 / 3 * 2 - 8 % 3  // try to declare data type first and print out the result


Expected Output :
43
1
19
13

     */
    public static void main(String [] args){
        int a = -5; int b = 8; int c = 6;
        int result = a + b * c;

        System.out.println(result);

        int d = 55; int e = 9; int f = 9;
        System.out.println((d + e)% f);

        int m = 20; int l =-3; int n = 5; int k =8;
        System.out.println(m + l * n / k);

        int q = 5; int w = 15; int r =3; int t =2; int y = 8; int u = 3;
        System.out.println(q + w / r * t -y % u);


    }



}
