package Firstclass.Sets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
//1.Write a Java program to add 5 elements to the hash set
//2. Print them to the stdout by for each loop


public class HashSetEx {
    public static void main(String[] args) {
        HashSet <String> colours = new HashSet<>();
        colours.add("white");
        colours.add("red");
        colours.add("green");
        colours.add("black");
        // for each loop

        for(String colour: colours){


            System.out.println(colour);
        }
        // iterator
        Iterator <String> colourIterator = colours.iterator();
        while(colourIterator.hasNext()){
            System.out.println(colourIterator.next());

        }

        List<Integer> list =Arrays.asList(1,2,3,5,3,4,7,1);

        HashSet<Integer> setOfNum= new HashSet(list);
        System.out.println(setOfNum.toString());


    }
}
