package HomeWork;

public class ReturnFirstHalf {
    /* Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"

     */
    public static void main(String[] args) {
        String WooHoo = "WooHoo";
        String HelloThere = "HelloThere";
        String abcdef = "absdef";

        String Woo = WooHoo.substring(0,3);
        String Hello = HelloThere.substring(0,5);
        String abc =abcdef.substring(0,3);


        System.out.println("The firstHalf of WooHoo is " + Woo);
        System.out.println("The firstHalf of HelloThere is " + Hello);
        System.out.println("The firstHalf of abcdef is " + abc);

    }
}

