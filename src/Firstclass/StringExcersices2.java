package Firstclass;

public class StringExcersices2 {
    public static void main(String[] args) {
        String sunday = "Sunday";
        String monday = "Monday";

        sunday.concat("Sunday").toUpperCase();
        System.out.println(sunday);

        String s1 = sunday.concat("Sunday").toUpperCase();
        System.out.println(s1);

        System.out.println(halfIn("Wednesday"));
        System.out.println(otherHalf("Wednesday"));
    }
    public static String halfIn(String s){
        int legnth = s.length();
        String result = s.substring(0, legnth/2);
        return result;

    }
    public static String otherHalf(String s){
        int length = s.length();
        String result = s.substring(length/2, length); // return s.substring(0,s.length()/2);
        return result;                                 //                       =int length =s.length();

    }


}
