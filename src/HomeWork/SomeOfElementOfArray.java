package HomeWork;

public class SomeOfElementOfArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += (array[i]);
        }
        printIntArray(array);

        System.out.println("sum of all element " + sum);

    }

    public static void printIntArray(int[] numberArray) {
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("The index is " + i + " the value inside is " + numberArray[i]);
        }
    }
}
