package Exercises;
// shifting value to the left. for loop if value current index is 0 we skip. counter outer loop counter 10 assign under counter index each itiaration
// position back


import java.util.Arrays;

public class ShiftingValuesPuting00End {
    public static void main(String[] args) {
        int[] array ={ 1, 4, 6, 0, 2, 0, 7,0,3,9};
        System.out.println(Arrays.toString(array));

        int counter =0;
        for(int i =0; i< array.length; i++){
            if(array[i]!=0){
                array [counter] = array[i];
                counter++;
            }
        }
        while(counter< array.length){
            array [counter] =0;
            counter++;
        }
        System.out.println(Arrays.toString(array));
    }
}
