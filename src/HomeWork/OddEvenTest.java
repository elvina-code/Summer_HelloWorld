package HomeWork;

import java.util.Scanner;

public class OddEvenTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        isEvenOrodd(num);
    }
    public static int isEvenOrodd(int number){
        if(number % 2 == 0){
            String result = number + " is an even number";
            printMyString(result);
        }else{
            printMyString(number + " is an odd number");
        }
        return number;
    }
    public static  void printMyString(String text){

        System.out.println(text);
    }
}
