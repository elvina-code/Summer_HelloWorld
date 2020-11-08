package HomeWork;

import java.util.Scanner;

public class AgeMessage {
    /*Using if statements with compound conditions (like &&), make a program that displays a single message depending on the age given.
    This output of this assignment is identical to the "How Old Are You, Specifically" assignment. However, this time you must accomplish it using
    if statements with compound conditions and you must not use else if or else.
    message less than 16 "You
can't drive."
16 to 17 "You can
drive but not vote."

18 to 24 "You can
vote but not rent a car."

25 or older "You can
do pretty much anything."
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();

        if (age < 16) {
            System.out.println("You can not drive");
        }
        if (age >= 16 && age >= 17) {
            System.out.println("You can drive but not vote.");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("You can vote but not rent a car.");
        }
        if (age > 25) {
            System.out.println("You can do pretty much anything.");
        }

    }
}
