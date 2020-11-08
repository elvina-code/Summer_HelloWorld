package ProjectJira;

import java.util.Scanner;

public class AlphaPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any letter");
        String s = scanner.next();
        System.out.println(alphabetPosition(s));

    }
        public static String alphabetPosition(String text) {
                String result = "";
        for (int i = 0; i < text.length(); i++) {
            char code = text.toUpperCase().charAt(i);
            if (code > 64 && code < 91)
                result += (code - 64) + " ";
        }

        return result.substring(0, result.length() - 1);
}
    }

