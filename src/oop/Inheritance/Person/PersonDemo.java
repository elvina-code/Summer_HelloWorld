package oop.Inheritance.Person;

import oop.Inheritance.Student;

import java.util.ArrayList;
import java.util.Collections;

public class PersonDemo {
    public static void main(String[] args) {

        Person p1 = new Staff("Test", "street 1", "school1", 1000.0);
        Person p2 = new Students("Studen1", "street2", "developer", 2020, 1000);

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(p1);
        personArrayList.add(p2);

        System.out.println(p1);
        System.out.println(p2);

        for(Person p : personArrayList){
//            System.out.println(p.getClass().equals(Staff.class));// true and Students is false
//            System.out.println(p.getClass());// returns to package of staff and students
            if(p instanceof Staff){
                System.out.println("discounts 10%");
            }else if(p instanceof Students){
                System.out.println("discount 40%");
            }else{
                System.out.println("no discount");
            }
        }
    }
}
