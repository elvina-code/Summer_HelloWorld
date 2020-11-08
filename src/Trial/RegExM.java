package Trial;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExM {
    public static void main(String[] args) {

        //Create a method that  replace all vowels in the String
        //Patern that we can match in the String
        // [a-z]
        // \\d --> digit
        // lowerletters
        // elvina@gmail.com --> [A-Z-a-z0-9._-]+@[A-Z-a-z0-9._-]+\\.[A-Z-a-z]{2,4}


        System.out.println(replaceVowels("Hello World"));
        System.out.println(replaceDigits("Hell230o well223"));
        System.out.println(replaceLower("Hello World"));
        findMatched("\\d", " 1 3 4 h df 4 fd df 45"); // \\d* --> space plus


    }
    public static String replaceVowels(String s){
        return s.replaceAll("[a,u,o,i,e]", ""); // [a,u,o,i,e]{4,9}[$,!,%]--> searching min 4 max 9
    }
    public static String replaceDigits(String s){
        return s.replaceAll("\\d", ""); // \\D --> non digit
    }
    public static String replaceLower(String s){
        return s.replaceAll("[a-z]", ""); // [a-zA-Z]--->
    }
    public static void findMatched(String regEx, String str){
        Pattern check =Pattern.compile(regEx);
        Matcher regMatcher = check.matcher(str);

        while(regMatcher.find()){
            System.out.println(regMatcher.group());
//            System.out.println("begining Index:" + regMatcher.start());
//            System.out.println("ending Index:" + regMatcher.end());

        }

        }
    }

