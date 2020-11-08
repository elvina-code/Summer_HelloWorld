package ProjectJira.Code;
// As a user i want to write a program, that takes an array of integers or string,
// removes all duplicate items and returns a new array in the same sequential order as the old array (minus duplicates).
import java.util.*;

public class RemoveDuplArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a length of array: ");
        int length = scanner.nextInt();
        System.out.println("Enter numbers or words: ");

        String [] arr = new String[length];

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.next();
        }

        int end = arr.length;
        Set<String> set = new HashSet<>();

        for(int i = 0; i < end; i++){
            set.add(arr[i]);
        }
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());

        }
    }





}
