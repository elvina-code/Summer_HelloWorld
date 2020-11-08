package Firstclass.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapExc {
    public static void main(String[] args) {


        Map<Integer, String> nameStudents = new HashMap<>();
        nameStudents.put(1, "Mirlan");
        nameStudents.put(2, "Jiyde");
        nameStudents.put(3, "Irina");
        nameStudents.put(4, "Azamat");
        System.out.println(nameStudents);

        Scanner userInput = new Scanner(System.in);
        System.out.println("enter the key to get value:");

        Integer nameStudent = userInput.nextInt();
        if (nameStudents.containsKey(nameStudent)) {
            System.out.println(nameStudents.get(nameStudent));
        } else {
            System.out.println("Sorry no data for that key!");
        }


        Set<Integer>names = nameStudents.keySet();
        for(Integer num: names){
            System.out.println("names " + num + " belongs to: " + nameStudents.get(num));
        }

//        putAll method adds all of the values from the map in the param to the current map
//        if maps contain duplicate keya the key value pair from the map in the param will be used
//        the original one will be overridden(override--> updating)
        Map<Integer, String> nameStudentsFromGoogle = new HashMap<>();
        nameStudentsFromGoogle.put(12, "Askar");
        nameStudentsFromGoogle.put(24, "Baha");
        nameStudentsFromGoogle.put(37, "Elvina");
        nameStudentsFromGoogle.put(4, "Google");
        System.out.println(nameStudentsFromGoogle);

        nameStudents.putAll(nameStudentsFromGoogle);
        System.out.println(nameStudents);
    }

}
