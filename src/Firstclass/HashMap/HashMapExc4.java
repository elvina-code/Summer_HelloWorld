package Firstclass.HashMap;

import java.util.HashMap;

public class HashMapExc4 {
    public static void main(String[] args) {

        HashMap<Integer, String> studentsMap = new HashMap<>();

        studentsMap.put(1, "StudentAzamat");
        studentsMap.put(2, "StudentZalkar");
        studentsMap.put(3, "StudentMerurt");

        HashMap<Integer, String> studentsMap2 = new HashMap<>();
        studentsMap.put(10, "StudentMirlan");
        studentsMap.put(20, "StudentJyide");
        studentsMap.put(30, "StudentIrina");


        studentsMap.putAll(studentsMap2);
        System.out.println("After the putAll");
        System.out.println("values " + studentsMap.toString());


    }
}
