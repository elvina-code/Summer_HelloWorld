package HomeWork;
import java.util.ArrayList;
public class ArrayExam {

        public static void main(String[] args) {
            //Creating a generic ArrayList
            ArrayList<Object> arlTest = new ArrayList<>();
            //Size of arrayList
            System.out.println("Size of ArrayList at creation: " + arlTest.size());
            //Lets add some elements to it
            arlTest.add("D");
            arlTest.add("U");
            arlTest.add("K");
            arlTest.add("E");
            arlTest.add(3);

            //Recheck the size after adding elements
            System.out.println("Size of ArrayList after adding elements: " + arlTest.size());

            //Display all contents of ArrayList
            System.out.println("List of all elements: " + arlTest.toString());

            //Remove some elements from the list
            arlTest.remove("D");
            System.out.println("See contents after removing one element: " + arlTest.toString());

            //Remove element by index
            arlTest.remove(2);
            System.out.println("See contents after removing element by index: " + arlTest.toString());

            //Check size after removing elements
            System.out.println("Size of arrayList after removing elements: " + arlTest.size());
            System.out.println("List of all elements after removing elements: " + arlTest.toString());

            //Check if the list contains "K"
            System.out.println(arlTest.contains("K"));

        }
    }

