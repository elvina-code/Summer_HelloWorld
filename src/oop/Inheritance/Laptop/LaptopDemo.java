package oop.Inheritance.Laptop;

import java.util.ArrayList;
import java.util.List;

public class LaptopDemo {
    public static void main(String[] args) {

        Owner owner = new Owner("John Doe", "abc123", 12);
        owner.setAge(18);

        List<String> classes = new ArrayList<>();
        classes.add("java");
        classes.add("agile");
        classes.add("ui testing");

//        List<String> classes1 = Arrays.asList("java", "agile", "ui testing");

        owner.setClasses(classes);

        Laptop laptop = new Laptop("Apple", "MacBook 16", "scpace gray", 2.5, owner);

        System.out.println(laptop.toString());

    }
}
