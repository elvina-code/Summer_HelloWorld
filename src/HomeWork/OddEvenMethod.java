package HomeWork;

import java.util.Scanner;

public class OddEvenMethod {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        isEvenOrodd(num);
        isEvenOrodd(3);
        isEvenOrodd(14);


    }
    public static int isEvenOrodd(int number){
        if(number % 2 == 0){
            String result = number + " even";
            printMyString(result);
        }else{
            printMyString(number + " odd");
        }
        return number;
    }
    public static  void printMyString(String text){

        System.out.println(text);
    }
}
