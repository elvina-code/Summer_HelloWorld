package Firstclass; // Primitive data type method dont change any value

public class VoidMethods1 {
    public static void main(String [] args){
        int num1 = 9;
        System.out.println("I am before incrementing:" +num1);//1
        incrementNum(num1);
        System.out.println("I am after incrementing:" +num1);//4
    }
    public static void incrementNum(int a){
        System.out.println("I am increment method");//2
        a = a + 1;
        System.out.println("I am a and my value is " + a);//3
    }
}
