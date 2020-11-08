package ProjectJira;
//Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.
//
//mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
//mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
//mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ModifyAndReturnMap {
    public static Map<String, String> mapBully(Map <String, String> map) {
        if(map.containsKey("a")){
            map.put("b",map.get("a"));
            map.put("a","");
        } return map;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of map,only numbers");
        int size = in.nextInt();

        HashMap<String, String> hmap = new HashMap<>(size);
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the key and Value of map");
            String a = in.next();
            String b = in.next();

            hmap.put(a, b);
        }

        System.out.println(mapBully(hmap));

    }



}
