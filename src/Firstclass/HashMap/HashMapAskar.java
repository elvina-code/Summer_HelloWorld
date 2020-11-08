package Firstclass.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapAskar {
    public static void main(String[] args) {
        Map<Integer, List<Double>> firmTransMap = new HashMap<>();

//        List<Double> list = Arrays.asList(1, 4, 56,22); will be immutable
//        List<Double> list2 = new ArrayList<>(list); will be mutable

        List<Double> firm1 = new ArrayList<>();
        List<Double> firm2 = new ArrayList<>();
        List<Double> firm3 = new ArrayList<>();
//        List<Double> firm4 = new ArrayList<>(Arrays.asList(1,2,3,4));


        firmTransMap.put(1, firm1);
        firmTransMap.put(2, firm2);
        firmTransMap.put(3, firm3);

        firm1.add(100.0);
        firm1.add(13.0);
        firm1.add(22.0);

        firm2.add(15.0);
        firm2.add(54.0);

        firm3.add(78.0);

        firmTransMap.put(1,firm1);
        firmTransMap.put(2,firm2);
        firmTransMap.put(3,firm3);
        System.out.println(firmTransMap);

        System.out.println(firmTransMap.get(1));
        System.out.println(firmTransMap.get(2));
        System.out.println(firmTransMap.get(1).get(1));

        firmTransMap.get(3).add(79.99);
        System.out.println(firmTransMap.get(3));

        Map<Integer, String> zipAndCity = new HashMap<>();
        zipAndCity.put(10005, "New York");
        zipAndCity.put(10005, "Boston");

        System.out.println(zipAndCity);







    }
}
