package Firstclass.Array;

import java.util.ArrayList;
import java.util.List;

public class FindFirstLast {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(56);
        list.add(23);
        list.add(12);
        System.out.println(list.get(0));
        System.out.println("ArrayList contains:" +list);
        System.out.println(list.size());
        findFirstLast(list);
        getMaxMin(list);


    }


    public static void findFirstLast(List<Integer> list) {

        if(list!=null && !list.isEmpty()){
            System.out.println("first element "+ list.get(0));
            System.out.println("last element "+list.get(list.size()-1));
        }


    }
    public static void getMaxMin(List<Integer> list){
        if(list.get(0)<list.get(list.size()-1)){
            System.out.println("min:" +list.get(0)); // if the list in increasing order
            System.out.println("max:"+list.get(list.size()-1));
        }else{
            System.out.println("min"+list.get(list.size()-1));// if the list in decreasing order
            System.out.println("max"+ list.get(0));
        }
    }
}