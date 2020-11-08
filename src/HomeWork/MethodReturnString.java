package HomeWork;


public class MethodReturnString {

/*Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
    If the string is shorter than length 2, return whatever there is,
    so "X" yields "X", and the empty string "" yields the empty string "".
    Note that str.length() returns the length of a string.
     */


    public static void main(String[] args) {
        String s = "Hello";
        String s1 ="abcdefg";
        String s2 ="ab";
        name(s);
        name(s1);
        name(s2);
    }
    public static String name(String str) {
        int name = str.length();
        if (name < 2) {
            System.out.println(str);
        } else {
            System.out.println(str.substring(0, 2));
        }
        return str;
    }


}
