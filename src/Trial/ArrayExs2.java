package Trial;

public class ArrayExs2 {
    public static void main(String[] args) {
        String [] birds = new String [6];
        System.out.println(birds.length); //6
        birds[0] = "kanareyka";
        birds[1]= "parrot";
        birds[2] ="dove";
        System.out.println(birds[2]);// index of 2 is 3rd element

        int [] numbers = new int [10];
        for(int i =0; i < numbers.length; i++){
            numbers [i] =i + 5;
        }
        System.out.println(numbers[2]);

        int[] number = {1, 2, 3, 4, 5, 6};
        for (int i = 5; i >= 0; i--) {
            System.out.println("Dicrement numbers " +number[i]);
        }


        int[][]array = new int[3][5];

        for(int i=0; i<array.length; i++){
           for(int j=0; j<array[i].length; j++){
               System.out.println(array[i][j] + " ");
           }
        }
        System.out.println();

    }



}
