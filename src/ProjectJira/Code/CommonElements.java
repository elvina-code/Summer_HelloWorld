package ProjectJira.Code;

public class CommonElements {
    public static void main(String[] args) {

        int[] array1 = {4, 7, 3, 11, 1, 9, 2, 4};
        int[] array2 = {4, 3, 2, 12, 9, 40, 32, 4};
        //this is Iterating Array1
        for (int i = 0; i < array1.length; i++) {
            // this is Iterating Array2
            for (int j = 0; j < array2.length; j++) {
                // this is comparing between two arrays if are equal.
                if (array1[i] == array2[j]) {
                    // this method is printing out the common elements of the Array1 and Array2
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
//import java.util.HashSet;
//import java.util.Set;
//
//public class ArraysCommonElements {
//    public static void main(String[] args) {
//        int [] array1 = {4, 7, 3, 11, 1, 9, 2,  4};
//        int [] array2 = {4, 3, 2, 12, 9, 40, 32, 4};
//
//        ArraysCommonElements arraysCommonElements = new ArraysCommonElements();
//
//        System.out.println(arraysCommonElements.findCommonElement(array1, array2));
//    }
//
//    private Set<Integer> findCommonElement(int[] array1, int[] array2) {
//        if (array1.length != array2.length) {
//            return new HashSet<>();
//        }
//
//        Set<Integer> commonElements = new HashSet<>();
//
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array1.length; j++) {
//                if (array1[i] == array2[j]) {
//                    commonElements.add(array1[i]);
//                }
//            }
//        }
//
//        return commonElements;
//    }
//
//    public Set<Integer> removeDuplicate(int[] commonElements) {
//        Set<Integer> uniqueElements = new HashSet<>();
//
//        for (int i = 0; i < commonElements.length; i++) {
//            uniqueElements.add(commonElements[i]);
//        }
//
//        return uniqueElements;
//   }
//}
