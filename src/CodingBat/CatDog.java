package CodingBat;
//Return true if the string "cat" and "dog" appear the same number of times in the given string.
//
//
//catDog("catdog") → true
//catDog("catcat") → false
//catDog("1cat1cadodog") → true


public class CatDog {
    public static boolean catDog(String str) {
        int pos = 0;
        int res = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            pos = str.indexOf("cat", pos);
            if (pos == -1) {
                pos++;
                break;

            } else {
                pos++;
                res++;
            }
        }
        int pos1 = 0;
        int res1 = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            pos1 = str.indexOf("dog", pos1);
            if (pos1 == -1) {
                pos1++;
                break;

            } else {
                pos1++;
                res1++;
            }
        }

        return res == res1;

    }
}
