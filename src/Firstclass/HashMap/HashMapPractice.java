package Firstclass.HashMap;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, List<String>> stateAndCity = new HashMap<>();
        stateAndCity.put("New York", Arrays.asList(("Manhattan,Brooklyn, Queens, Bronx")));
        System.out.println(stateAndCity);

    }
}
