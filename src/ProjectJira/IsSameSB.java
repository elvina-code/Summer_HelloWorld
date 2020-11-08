package ProjectJira;

import java.util.Scanner;

public class IsSameSB {
    public static void main(String[] args) {

        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter a word for String:");
        String str = userIn.next();

        System.out.println("Enter a word for StringBuilder:");
        StringBuilder sb = new StringBuilder(userIn.next());

        System.out.println(isSame(str,sb));
    }
    public static boolean isSame (String a, StringBuilder b){
        boolean result = false;
        if(b.toString().equalsIgnoreCase(a)){
            result = true;
        }
        return result;
    }

}


