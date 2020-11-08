package ProjectJira;

import java.util.Scanner;

public class Position {

    static String alphabetPosition(char[] s) {

        for (int i = 0; i < s.length; i++) {

            if (charAt(s[i])){
                if (s[i] == 'z') {
                    break;
                } else {
                    s[i] = (char) (s[i] + 1);
                }
            }
        }
        return String.valueOf(s);
    }

    private static boolean charAt(char c) {
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any letter");
        String s = scanner.next();

        System.out.println(alphabetPosition(s.toCharArray()));
    }
}


