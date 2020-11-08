package HomeWork;

public class Exercise {
    public static void main(String[] args){
        int a = 5%3+4/2;//3.(2)+2=4
        int b = a++ +12;// 4 +12 =16
        int c = a+b; //4 became 5+16=21

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        boolean isTrue = a < b;

        System.out.println(c + " > " + a  + " < " + b + " = " + isTrue);
        System.out.println(a);
    }





}
