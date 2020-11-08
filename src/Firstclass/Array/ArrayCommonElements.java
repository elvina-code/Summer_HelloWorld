package Firstclass.Array;

import java.util.ArrayList;

public class ArrayCommonElements {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        addIfNotExists(list1,1);
        addIfNotExists(list1,2);
        addIfNotExists(list1,3);
        addIfNotExists(list1,1);
        addIfNotExists(list1,1);
        System.out.println(list1.toString());// with deleteing similar elements

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(1);
        list2.add(2);
        list2.add(2);
        list2.add(1);
        System.out.println(list2.toString());// it will not delete similar elements

        ArrayList<Integer> list3 = commonElements(list1,list2);
        System.out.println("common elements are "+ list3);

    }
    public static Boolean addIfNotExists(ArrayList <Integer> number, Integer element){
        if(!number.contains(element)){ // wont add similar elements
            number.add(element);
            return true;
        }else{
            return false;
        }
    }
    public static ArrayList<Integer> commonElements (ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> commonList = new ArrayList<>();
        for(Integer element1: list1){
            if(list2.contains(element1)){
                addIfNotExists(commonList,element1);
            }
        }
        return commonList;
    }
}
