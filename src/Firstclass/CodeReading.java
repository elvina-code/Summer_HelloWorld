package Firstclass;

public class CodeReading {
    public static void main(String[] args) {
    CodeReading cd = new CodeReading();
    double [] array ={1.0, 2.0, 3.0, 4.0};
        System.out.println("something" + cd.noNameMethod(array));


    }
    public double noNameMethod(double[] array){
        return noNameMethod1(array)/ array.length;//noNameMethod as AvarageOfArrayValues. noNameMethod  is dividing it by the length of array which is 10/4 and result is 2.5

    }
    public double noNameMethod1(double [] array){
        double s =0.00;
        for(int i= 0; i < array.length; i ++){
            s += array[i]; // noNameMethod1 as the sumOfArrays. noNameMethod1 is a loop which is adding s to the values inside the array and result is 10
        }
        return s;
    }

}
