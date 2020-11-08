package ProjectJira;
//Write a Java program to get the number of elements in a hash set.
//Output:
//Original Hash Set: [Red, White, Pink, Yellow, Black, Green]
//Size of the Hash Set: 6
//Original Hash Set: [Red, White, White]
//Size of the Hash Set: 2

// Set cannot contain Duplicates and unordered

import java.util.HashSet;
import java.util.Scanner;

public class GetNumbersElementsHashSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of set only numbers");
        int size  =  input.nextInt();


        // Creating an empty HashSet
        HashSet<String> set = new HashSet<String>();
        for(int i = 0; i < size; i ++){
            System.out.println("Please enter the elements of set");
            String setElement = input.next();
            set.add(setElement);

        }


        // Use add() method to add elements into the Set
//        set.add("Red");
//        set.add("White");
//        set.add("Pink");
//        set.add("Yellow");
//        set.add("Black");
//        set.add("Green");

        // Displaying the HashSet
//        System.out.println("HashSet: " + set);

        System.out.println(set.toString());
        System.out.println("The size of the set is: " + set.size());

        // Displaying the size of the HashSet
//        System.out.println("The size of the set is: " + set.size());
    }

}
