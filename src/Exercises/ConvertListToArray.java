package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {
    public static void main(String[] args) {
        List <String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("dove");
        birds.add("dove");
        birds.add("parrot");
        System.out.println(birds);

       String [] birdsArrStr = birds.toArray(new String[0]);// String wrapper class
//        String [] arr = new String[0];
//        String [] birdsArrStr = birds.toArray(arr);

        System.out.println(Arrays.toString(birdsArrStr));

        List<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(2);
        numbers.add(131);
        numbers.add(114);
        numbers.add(112);
        System.out.println(numbers);

        Integer [] numberArrStr= numbers.toArray(new Integer[0]); // Integer wrapper class
        System.out.println(Arrays.toString(numberArrStr));

//////////////////////////////////////////////////////////////////////
        Integer[] years ={1999,2020,2020,2011,1967};
        System.out.println(Arrays.toString(years));

        
        List <Integer> yearList = Arrays.asList(years);
        System.out.println(yearList);

    }
}
