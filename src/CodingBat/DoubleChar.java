package CodingBat;
//Given a string, return a string where for every char in the original, there are two chars.
//
//
//doubleChar("The") → "TThhee"
//doubleChar("AAbb") → "AAAAbbbb"
//doubleChar("Hi-There") → "HHii--TThheerree"
//Hint:
//Declare a local String result variable, starting with the empty string "".
// The standard loop over every char in a string is: "for (int i=0; i<str.length(); i++) { ...".
// Inside the loop, use "str.charAt(i)" or "str.substring(i, i+1)" to get each char, and add them to the result string with "=" and "+".



//public String doubleChar(String str) {
//  String result = "";
//  for (int i = 0; i < str.length(); i++) {
//    result = result + str.charAt(i) + str.charAt(i);
//    // Alternately:
//    // result = result + str.substring(i, i+1) + str.substring(i, i+1);
//  }
//  return result;
//}


import java.util.Scanner;

public  class DoubleChar {
//    public static String doubleChar(String str) {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (char c : str.toCharArray()) {
//            stringBuilder.append(c);
//            stringBuilder.append(c);
//
//
//        }
//        return stringBuilder.toString();

    public static String doubleChar(String str){
        String result ="";
        for(int i = 0; i < str.length(); i++){
            result += str.charAt(i);
            result += str.charAt(i);

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine();
        System.out.println(doubleChar(word));

    }
}

