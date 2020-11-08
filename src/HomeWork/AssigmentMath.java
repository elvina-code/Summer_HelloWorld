package HomeWork;

public class AssigmentMath {
    /* 1. Write a Java program to compute the specified expressions and print the output.
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output
2.138888888888889

Example: System.out.println(3.6+5.5)   the output is : 9.1

2. Write a Java program to compute a specified formula.

Specified Formula :
4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
Expected Output
2.9760461760461765

     */
    public static void main(String [] args){

        double a = 25.5; double b = 3.5; double c = 40.5; double d = 4.5;

        System.out.println((a * b - b * b) / (c - d));

        double e = 4.0;
        double f = 1.0;
        int num1  = 1, num2 = 3, num3 = 5, num4 = 7, num5 = 9, num6 = 11;

        System.out.println(e * (num1  - (f/num2) + (f/num3) - (f/num4) + (f/num5) - (f/num6)));
    }
}
