package Firstclass.Array;

import java.util.ArrayList;

public class ArrayExcludingSimilarElements {
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>();
        addIfNotExists(list1,1);
        addIfNotExists(list1,2);
        addIfNotExists(list1,3);
        addIfNotExists(list1,1);
        addIfNotExists(list1,1);
        System.out.println(list1.toString());

    }
    public static Boolean addIfNotExists(ArrayList <Integer> list, Integer element){
        if(!list.contains(element)){ // wont add similar elements
            list.add(element);
            return true;
        }else{
            return false;
        }
    }
}
