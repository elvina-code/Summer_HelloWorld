package HomeWork;

import java.sql.SQLOutput;
import java.util.Scanner;

//public class PhoneKeyPad {
    //    PhoneKeyPad (String & char)
//On your phone keypad, the alphabets are mapped to digits as follows: ABC(2), DEF(3), GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9).
// Write a program called PhoneKeyPad, which prompts user for a String (case insensitive), and converts to a sequence of keypad digits.
// Use (a) a nested-if, (b) a switch-case-default.
//Hints
//You can use in.next().toLowerCase() to read a String and convert it to lowercase to reduce your cases.
//In switch-case, you can handle multiple cases by omitting the break statement, e.g.,
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a string to convert in phone keypad: ");
//        String str = in.next();
//
//
//    }
//
//    public static int getNumber(char inChar) {
//        int num = 0;
//        switch (inChar) {
//            case 'a':
//            case 'b':
//            case 'c':
//                num = 2;
//                System.out.print(num);
//                break;
//            case 'd':
//            case 'e':
//            case 'f':
//                num = 3;
//                System.out.print(num);
//                break;
//            case 'g':
//            case 'h':
//            case 'i':
//                num = 4;
//                System.out.print(num);
//                break;
//            case 'j':
//            case 'k':
//            case 'l':
//                num = 5;
//                System.out.print(num);
//                break;
//            case 'm':
//            case 'n':
//            case 'o':
//                num = 6;
//                System.out.print(num);
//                break;
//            case 'p':
//            case 'q':
//            case 'r':
//            case 's':
//                num = 7;
//                System.out.print(num);
//                break;
//            case 't':
//            case 'u':
//            case 'v':
//                num = 8;
//                System.out.print(num);
//                break;
//            case 'w':
//            case 'x':
//            case 'y':
//            case 'z':
//                num = 9;
//                System.out.print(num);
//                break;
//            default:
//                System.out.print(num);
//        }
//    }
//
//
//    }
//}
//
