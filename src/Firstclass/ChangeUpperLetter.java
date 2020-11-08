package Firstclass;

public class ChangeUpperLetter {
    public static void main(String[] args) {
        String name ="elvina";
        System.out.println(firstUpperLetter(name));
        convertAndPrintTwoWord("elvina", "begimbaeva");
    }
    public static String firstUpperLetter(String s){
        String firstLetter= s.substring(0,1).toUpperCase();
        String result = firstLetter.concat(s.substring(1,s.length()));
        return result;
    }

    public static void convertAndPrintTwoWord(String s, String s1) {

        System.out.println(firstUpperLetter(s) + " " + firstUpperLetter(s1));
    }

}
