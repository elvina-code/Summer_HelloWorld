package Firstclass.Array;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "abcde";
        char [] array = str.toCharArray();
        System.out.println(Arrays.toString(array));

        // anagram task:
        String s1 = "fabc";
        String s2 = "bacf";

        char [] c1 = s1.toCharArray();
        char [] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        System.out.println(Arrays.toString(c1));
        System.out.println(Arrays.toString(c2));

        boolean isAnagram = Arrays.equals(c1,c2);

        System.out.println(isAnagram);

    }
}
