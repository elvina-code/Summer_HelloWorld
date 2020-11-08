package Firstclass.Array;

public class ArrayMaxGrade {

    public static void main(String[] args) {

        double grades [] = {86.7, 89.5, 99.7, 96.8, 99.0, 89,5};
        double max;
        max = grades [0];
        for(int i =0; i< grades.length; i++){
            if(grades [i] > max){
                max= grades[i];
            }
        }
        System.out.println("The max grades is " + max);
    }

    }

