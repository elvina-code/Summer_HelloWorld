package HomeWork;


import java.util.List;
import java.util.ArrayList;

public class CreateArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList of String
        List<String> animals = new ArrayList<>();

        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        System.out.println(animals);

        animals.add(2, "Elephant");

            System.out.println(animals);
        }

    }

