package ProjectJira.Code;

import java.util.Scanner;

public class IsSameStrSB {

        public static void main(String[] args) {

            Scanner userIn = new Scanner(System.in);
            System.out.println("Enter a word:");
            String str = userIn.next();
            System.out.println("Enter a word:");
            StringBuilder sb = new StringBuilder(userIn.next());
            System.out.println(isSameSt(str,sb));
        }
        public static boolean isSameSt (String a, StringBuilder b){
            boolean result = false;
            if(b.toString().equalsIgnoreCase(a)){
                result = true;
            }
            return result;
        }

    }


