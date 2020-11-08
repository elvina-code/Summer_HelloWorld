package HomeWork;
//[Thomas, Robin, Jane, David, Becky]
//false
//true
//false
//2
//[Robin, Jane, David]
//true
//[]

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Jane");
        names.add(0, "Thomas");
        names.add(1, "Robin");
        names.add("David");
        names.add("Becky");

        System.out.println(names);
        //check is Empty
        System.out.println(names.isEmpty());

        //use contains
        System.out.println(names.contains("Thomas"));
        //use contains
        System.out.println(names.contains("Mary"));
        //indexOf
        System.out.println(names.indexOf("Jane"));
        //use subList()
        System.out.println(names.subList(1,4));
        //delete
        System.out.println(names.removeAll(names));
        //check isEmpty
        System.out.println(names.isEmpty());
        // print all
        System.out.println(names);
    }
}
