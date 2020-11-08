package Exercises.StudentMentor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMoveToEnd {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(2, 3, 4, 1, 3 ,0, 1, 0, 4);
        int toMove = 1;

        ArrayMoveToEnd arrayMoveToEnd = new ArrayMoveToEnd();
        List<Integer> result = arrayMoveToEnd.moveElement(array,toMove);
        System.out.println(result);

    }
    public List<Integer> moveElement(List<Integer> array, int toMove){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < array.size(); i ++){
            if(array.get(i).equals(toMove)){
                list1.add(array.get(i)); // collects
            }else{
                list2.add(array.get(i));
            }
        }
        list2.addAll(list1);
        return list2;
    }

}
