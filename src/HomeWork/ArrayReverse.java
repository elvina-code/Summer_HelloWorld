package HomeWork;

public class ArrayReverse {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        reverse(array);
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
    public static void reverse (int [] array){
        for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
}

