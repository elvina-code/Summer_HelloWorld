package HomeWork;

import java.util.Scanner;

public class MethodExponent {
//    Write a method called exponent(int base, int exp) that returns an int value of base raises to the power of exp. The signature of the method is:
//  public static int exponent(int base, int exp);
//Assume that exp is a non-negative integer and base is an integer. Do not use any Math library functions.
//Also write the main() method that prompts user for the base and exp; and prints the result. For example,
//Enter the base: 3
//Enter the exponent: 4
//3 raises to the power of 4 is: 81
public static void main(String[] args) {
    // Declare variables
    Scanner scanner =new Scanner(System.in);
    int base;   // base (integer)
    int exp;   // exponent (non-negative integer)
    // Prompt and read exponent and base
    base= scanner.nextInt();
    exp = scanner.nextInt();
    // Print result
    System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
}

    // Returns "base" raised to the power "exp"
    public static int exponent(int base, int exp) {
        int product = 1;   // resulting product
        // Multiply product and base for exp number of times
        for (int i=0; i < exp; i++) {
            product *= base;
        }

        return product;
    }
}
