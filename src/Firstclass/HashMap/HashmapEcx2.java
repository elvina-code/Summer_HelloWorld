package Firstclass.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
//1. Write a Java program to associate the specified value with the specified key in a HashMap.
//2. Ask from user to enter the key, and if particular key is present return its value.
//3. Write a Java program to copy all of the mappings from the specified map to another map.
public class HashmapEcx2 {
    public static void main(String[] args){
        Map<String, String> emailsNamesMap = new HashMap<>();
        emailsNamesMap.put("student1@test.com", "Student1");
        emailsNamesMap.put("student2@test.com", "Student2");
        emailsNamesMap.put("student3@test.com", "Student3");

        Scanner userInput = new Scanner(System.in);
        String email = userInput.next();
        if (emailsNamesMap.containsKey(email)) {
            System.out.println(emailsNamesMap.get(email));
        } else {
            System.out.println("Sorry no data for that key!");
        }

        HashMap<String, String> testMap = copyMaps(emailsNamesMap);

        System.out.println(testMap.values().toString()); // doesnt quarantee order

        System.out.println(testMap.toString());

        System.out.println("getting values by entrySet ");
        Set<Map.Entry<String, String>> entries = emailsNamesMap.entrySet();
        for (Map.Entry<String, String> entry: entries) {
            System.out.println(entry.getKey() +"  "+entry.getValue());
            if (entry.getKey().contains("student1")) {
                System.out.println("I am updating set not map");
                entry.setValue("StundentN1");
            }
        }

        System.out.println("I am updating map not set");
        emailsNamesMap.put("student2@test.com", "StundentN2");

        System.out.println("this is output of map: "+emailsNamesMap.values().toString());
        System.out.println("this is output of a set");
        for (Map.Entry<String, String> entry: entries) {
            System.out.println(entry.getKey() +"  "+entry.getValue());
        }




    }

    public static HashMap<String, String> copyMaps(Map<String, String> srcMap){
        HashMap<String, String> destMap = new HashMap<>();
        Set<String> keys = srcMap.keySet();
        for (String key: keys) {
            destMap.put(key, srcMap.get(key));
        }
        return destMap;
    }
}
