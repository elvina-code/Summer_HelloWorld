package ProjectJira;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class CommonElementArray {
    public static void main(String[] args) {
        int[] array1 = {4, 7, 3, 11, 1, 9, 2, 4};
        int[] array2 = {4, 3, 2, 12, 9, 40, 32, 4};

        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));


        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == (array2[j])) {

                    System.out.println("Common elements are: " + (array1[i]));
                }
            }
        }
//        RemoveDup run = new RemoveDup();
//        System.out.println("Here's your data without duplicates: " + run.unique(stringArr));
    }



    public Set<String> unique(String[] stringArr) {
        return new LinkedHashSet<String>(Arrays.asList(stringArr));


    }
}
