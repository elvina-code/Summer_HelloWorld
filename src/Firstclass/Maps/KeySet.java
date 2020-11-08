package Firstclass.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KeySet {
    public static void main(String[] args) {
        Map<String, String> mapCountryCodes = new HashMap<>(); // mapCountryCosed is map
        mapCountryCodes.put("1", "USA");
        mapCountryCodes.put("23", "France");
        mapCountryCodes.put("11", "Japan");



        Set <String> setCodes= mapCountryCodes.keySet();
        Iterator<String> iterator = setCodes.iterator();
        while (iterator.hasNext()){
            String code = iterator.next();// key
            String country = mapCountryCodes.get(code);
            System.out.println(code + " = " + country);
        }
        // keySet method return a Set of the keys. set is used here because keys int the map are quaranteed to be unique

        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Olga");
        students.put(2, "Lena");
        System.out.println(students.getOrDefault(1, "Such code doesnt exit"));
        System.out.println(students.getOrDefault(3, "Such code doesnt exit"));

        Set<Integer> studentsId = students.keySet();
        Iterator<Integer> iterator1 = studentsId.iterator();
        while(iterator1.hasNext()){
            int id = iterator1.next();
            String name= students.get(id);
            System.out.println("id " + id + " name " + name);


        }
    }

}
