package Firstclass;

public class CodeReading1 {
    public static void main(String[] args) {
        CodeReading1 cr = new CodeReading1();
        int [] array = {3,4,7,1,10,100};{
            System.out.println("first try " + cr.search(array,-1));
            System.out.println("second try " + cr.search(array,7));
            System.out.println("Minimum value of is " + cr.findMinimum(array));
            System.out.println("Maximum value of is " + cr.findMaximum(array));
        }


    }
    public int search(int [] array, int element){
        int a = -1;
        for(int i = 0; i < array.length; i ++){
            if (array[i] ==element){
                a=element;
                break;
    }
        }
        return a;
    }
    public int findMinimum(int [] array){
        int min = array[0];
        for(int i =0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    public int findMaximum(int[] array){
        int max = array[0];
        for(int i =0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;


    }

}


