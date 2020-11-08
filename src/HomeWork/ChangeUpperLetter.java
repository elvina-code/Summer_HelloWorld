package HomeWork;


import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class ChangeUpperLetter {
    /* Please write your first and last name in lower letters then your program should change it to first letter only to upper letter.

Ex: akilay    --> Akilay

       maratov--> Maratov

     */
    public static void main(String[] args) {
        String firstName = "akilay";
        String lastName = "maratov";
        System.out.println(convertFisrtToUpper("akilay"));
        System.out.println(convertFisrtToUpper("maratov"));

        }

        public static String convertFisrtToUpper(String s){
        String firstLetter = s.substring(0,1).toUpperCase();
        String result =firstLetter.concat(s.substring(1,s.length()));

        return result;

        //converts String to lower case char
        //char toChar = firstName.toUpperCase().charAt(0);
        //System.out.println(toChar);

        //System.out.println("akilay".toUpperCase());
    }



}


