package Exercises;

import java.util.Arrays;
import java.util.List;

public class ArraysasListMethod {
    public static void main(String[] args) {
        String [] a = new String[]{"A", "B","C", "D"};
        List<String> list = Arrays.asList(a);
        System.out.println(list);

        Integer b [] = new Integer[]{1,2,3,4,5};
        List<Integer> list1 = Arrays.asList(b);
        System.out.println(list1);
    }
}
