package Firstclass.Array;
//Finish the method findLongest to find and return the longest String in the ArrayList of Strings list.
import java.util.ArrayList;
public class ArrayFindLongest {
        public static String findLongest(ArrayList<String> list) {
            String longestString =list.get(0);// starts form 0 index

           for(int i =0; i < list.size(); i++){
               if(list.get(i).length()> longestString.length())
                   longestString =list.get(i);
           }
           return longestString;
        }


        public static void main(String[] args)
        {
            //instantiate ArrayList and fill with Integers
            ArrayList<String> values = new ArrayList<String>();
            String[] words = {"singapore", "cattle", "metropolitan", "turnstile"};
            for (int i = 0; i < words.length; i ++)
            {
                values.add(words[i]);
            }
            System.out.println("Expected Result:\t metropolitan");
            System.out.print("Your Result:\t\t ");
            System.out.println(findLongest(values));
        }
    }

