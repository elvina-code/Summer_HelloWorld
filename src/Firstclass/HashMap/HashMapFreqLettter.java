package Firstclass.HashMap;

import java.util.HashMap;
import java.util.Arrays;

public class HashMapFreqLettter {
    public static void main(String[] args) {
        HashMapFreqLettter hashMapFreqLettter = new HashMapFreqLettter();

        String  s = "Hello world . world is beautiful . I am beautiful too";
        System.out.println(hashMapFreqLettter.calculateWordFrequency(s).toString());
        System.out.println(hashMapFreqLettter.calculateLetterFrequency(s).toString());



    }
    // find numbers of words
    public HashMap<String, Integer> calculateWordFrequency(String text){ // return map accepting  String
        HashMap<String, Integer> result = new HashMap<>(); // key word, value counter
        String [] words = text.split(" "); // separate each word into an array accourding to space , can be arraylist
        System.out.println(Arrays.toString(words));
        for(String word: words){ // calculate frequaency
            if(result.get(word)== null)// if is word exist in the map // (!result.containsKey(word))
                result.put(word, 1); // key, value (first word counted as 1)
            else
            result.put(word,result.get(word)+1); // increment
        }

        return result;
    }
    public HashMap <Character, Integer> calculateLetterFrequency(String text){
        HashMap<Character, Integer> resultLetter = new HashMap<>();
        char [] strArray = text.toCharArray();
        for(int i = 0; i<strArray.length; i++){
            if(!resultLetter.containsKey(strArray[i])) {
                resultLetter.put(strArray[i], 1);
            }else{
                resultLetter.put(strArray[i], resultLetter.get(strArray[i])+1);

            }
        }


//        for(Character word: strArray){
//            if(resultLetter.get(word)== null)
//                resultLetter.put(word,1);
//            else
//                resultLetter.put(word,resultLetter.get(word)+1);
//        }
        return resultLetter;
    }


}
