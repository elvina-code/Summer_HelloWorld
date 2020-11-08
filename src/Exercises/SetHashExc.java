package Exercises;
import java.util.Arrays;
import java.util.Set;

import java.util.HashSet;

public class SetHashExc {
    public static void main(String[] args) {
        Set <Integer> setOfNumbers1 = new HashSet<>(Arrays.asList(3,7,3,6,8,9 ));
        Set <Integer> setOfNumbers2 = new HashSet<>(Arrays.asList(1,3,4,7,3,6,5,8,9));

        System.out.println(setOfNumbers2.containsAll(setOfNumbers1));
        System.out.println(setOfNumbers1.containsAll(setOfNumbers2));
        System.out.println(hash("A")); // acii table A=65

    }
    public static int hash (String s){
        int result =0;
        for(int i =0; i<s.length(); i++){
            result+=s.charAt(i);

        }
        return result * 2; // 65*2=130
    }
}
