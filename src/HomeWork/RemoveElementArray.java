package HomeWork;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class RemoveElementArray {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial List: " + programmingLanguages);
        // Remove the element at index `5`
        programmingLanguages.remove(5);
        System.out.println("After remove(5):" +programmingLanguages);
        //  remove "Kotlin"
        programmingLanguages.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\"):" +programmingLanguages);
        // Remove all the elements that exist in a given collection
        programmingLanguages.removeAll(programmingLanguages);
        // Remove all elements from the ArrayList
        programmingLanguages.clear();
        System.out.println("After clear():" + programmingLanguages);


    }


}
