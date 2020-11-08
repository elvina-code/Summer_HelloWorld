package Exercises;
/* Finish the following method ‘’removeLongStrings’’ that checks each element of the passed in ArrayList list
and removes any that are strictly longer than 4 characters.*/

import java.util.ArrayList;

public class Test4 {

        public static void removeLongStrings(ArrayList<String> list) {
            for(int i =0; i < list.size(); i++){
                    if(list.get(i).length() >=4 )// lenght
                        list.remove(i);

                System.out.println(list.toString());
            }
        }
        public static void main(String[] args)
        {
            //instantiate ArrayList and fill with Integers
            ArrayList<String> values = new ArrayList<String>();
            String[] words = {"bathtub", "fish", "computer", "cat", "foo"};
            for (int i = 0; i < words.length; i ++)
            {
                values.add(words[i]);
            }
            removeLongStrings(values);
            System.out.println("Expected Result:\t [fish, cat, foo]");
            System.out.println("Your Result:\t\t " + values);
        }
    }

