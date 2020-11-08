package Firstclass.Maps;

import java.util.HashMap;
import java.util.Map;
// Create a programm which will calculate the number occurrence of each character in a String.
//if map doesn't contain the char then add the char as a key
// and 1 as the value since it's the first occurance of the char
// if map contains the char in the keys then update its value.

public class charOcurrancesMap {
    public static void main(String[] args) {
        String str = "pineapple";

        Map<Character, Integer> charOcurrencesMap = new HashMap<>();
        for(int i=0; i < str.length(); i++){
            if(!charOcurrencesMap.containsKey(str.charAt(i))){
                charOcurrencesMap.put(str.charAt(i), 1);// create first charachter of String with new value going to be 1
            }else{
                int numOfCurrenceOcurance = charOcurrencesMap.get(str.charAt(i)); // value for this key will be returned
                charOcurrencesMap.put(str.charAt(i), numOfCurrenceOcurance+1); //update  +1 to existing value
            }
        }
        System.out.println(charOcurrencesMap);

    }
}
