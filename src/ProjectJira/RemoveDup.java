package ProjectJira;
// As a user i want to write a program, that takes an array of strings and of integers,
// removes all duplicate items and returns a new array in the same sequential order as the old array (minus duplicates).
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDup {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter a length of array: ");
        int length = userIn.nextInt();
        System.out.println("Enter numbers or words: ");

        String[] word = new String[length];

        for (int i = 0; i < length; i++) {
            word[i] = userIn.next();
        }
        RemoveDup removeDup = new RemoveDup();
        System.out.println("Here's your data without duplicates: " + removeDup.unique(word));
    }
    public Set<String> unique (String[] arr){
        return new LinkedHashSet<String>(Arrays.asList(arr));

    }
}


