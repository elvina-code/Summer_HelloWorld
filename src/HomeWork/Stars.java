package HomeWork;

public class Stars {
    public static void main(String[] args) {
        // Declare variables
        int numItems;
        int[] items = new int[5];  // Declare array name, to be allocated after numItems is known
        items[0] =7;
        items[1] =4;
        items[2] =3;
        items[3] =0;
        items[4] =7;


        // Print array in "index: number of stars" using a nested-loop
        // Take note that rows are the array indexes and columns are the value in that index
        for (int i = 0; i < items.length; ++i) {  // row
            System.out.print(i + ": ");
            // Print value as the number of stars
            for (int starNo = 1; starNo <= items[i]; ++starNo) {  // column
                System.out.print("*");
            }

        }

    }
}
