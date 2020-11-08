package Firstclass.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntrySet {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Olga");
        students.put(2, "Lena");

        Set<Map.Entry<Integer, String>> entries = students.entrySet();
        for(Map.Entry<Integer, String> entry: entries) {
            Integer studentId = entry.getKey();
            String studentName = entry.getValue();
            System.out.println(studentId+ "->" + studentName);

            }

        }

    }

