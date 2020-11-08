package Trial;

public class ArrayExs {
    public static void main(String[] args) {
        int[] arrays = new int[7];
        for (int i = 0; i <= 6; i++) {
            arrays[i] = i + 1;
        }
        System.out.println(arrays[2]);

        String backpack[] = {"pen", "pencil", "liner"};
        System.out.println(backpack[0]);

        int[] numbersArray = new int[5];

        numbersArray[0] = 23;
        numbersArray[1] = 25;
        System.out.println("number " + numbersArray[1]);
        numbersArray[1] = 67;
        System.out.println(numbersArray[1]);

        System.out.println("Index\tValue");
        int number[] = {2, 5, 6, 7, 8};
        for (int i = 0; i < number.length; i++) {
            System.out.println(i + " \t " + number[i]);
        }
        String ta = "A ";
        ta = ta.concat("B ");
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C', 'D');
        ta = ta.concat(tb);
        System.out.println(ta);

        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }

        }
    }
}
