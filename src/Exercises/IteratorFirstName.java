package Exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorFirstName {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Set<Integer> setEven = new HashSet<>();
        Set<Integer> setodd = new HashSet<>();
        for (Integer i : set) {
            if (i % 2 == 0) setEven.add(i);
        }

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i % 2 != 0) setodd.add(i);
        }

        System.out.println(setEven);
        System.out.println(setodd);

        Set<String> setName = new HashSet<>(Arrays.asList("John Baiden", "Elon Mask", "Elvina Begimbaeva"));
        Set<String> setOnlyFisrtName = new HashSet<>();

        Iterator<String> iterator1 = setName.iterator();

        while (iterator1.hasNext()) {
            String curr = iterator1.next();
            String[] arr = curr.split(" ");
            String firstName = arr[0];
            setOnlyFisrtName.add(firstName);

//            System.out.println(iterator.next().toUpperCase());
        }


//        for(String x: set) {
//            System.out.println(x);
//        }
//
//        set.forEach(System.out::println);
//    }
        System.out.println(setName);
        System.out.println(setOnlyFisrtName);
    }
}
