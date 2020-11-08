package CodingBat;
//Return the number of times that the string "hi" appears anywhere in the given string.
//
//
//countHi("abc hi ho") → 1
//countHi("ABChi hi") → 2
//countHi("hihi") → 2
//
//Hint:
//Use the standard for loop to iterate over the chars in the string, except stop one before the end like this:
//  for (int i=0; i < str.length()-1; i++) {
//Inside the loop use "str.substring(i, i+2)" to pull out a substring and test it with .equals("hi"), and if so increment a count.
// Alternately could write the comparisons like str.charAt(i)=='h' to check for the 'h' and 'i' individually

//public int countHi(String str) {
//  int count = 0;
//  // Loop to length-1 so we can access index i and i+1 in the loop.
//  for (int i = 0; i < (str.length() - 1); i++) {
//    if (str.substring(i, i+2).equals("hi")) count++;
//  }
//  return count;
//}

import java.util.Scanner;

public class CountHi {

public static int countHi(String str) {
    int pos = 0;
    int res = 0;
    for (int i = 0; i < str.length() - 1; i++) {
        pos = str.indexOf("hi", pos);
            if (pos == -1) {
                pos++;
                break;

            } else {
                pos++;
                res++;
            }
        }
        return res;

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        System.out.println(countHi(word));

    }

}
