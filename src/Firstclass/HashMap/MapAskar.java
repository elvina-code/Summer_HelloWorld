package Firstclass.HashMap;

import java.util.HashMap;
import java.util.Map;

public class MapAskar {

    public static void main(String[] args) {
       Map<Character, Integer> charOccurrenceMap = new HashMap <>();
       String str = "apple";
       for(int i = 0; i < str.length(); i++){
           if(!charOccurrenceMap.containsKey(str.charAt(i))){
               charOccurrenceMap.put(str.charAt(i), 1);
           }else{
               int numCurrentOccurenceMap = charOccurrenceMap.get(str.charAt(i));
               charOccurrenceMap.put(str.charAt(i), numCurrentOccurenceMap +1);
           }
       }

        System.out.println(charOccurrenceMap);

    }
}
