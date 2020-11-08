package Exercises;

public class Demo {
    public static void main(String[] args) {
        String num ="1234";
        int num1 = Integer.parseInt(num);
        System.out.println(num1);

        String myName = "elvina";
        System.out.println(myName.indexOf("l")); //elvina = 012345
        System.out.println("elvina".substring(1));// 1-->e

        int num3 =122;
        String stringNum= String.valueOf(num3);
        String stringNum1 = 122 + " ";
        System.out.println(stringNum);

        String name = "Gencode";
        String modifiedString = returnString(name);
        System.out.println(modifiedString);
//        int a = 1234;
//        int number=returnInt(a);
//        System.out.println(returnInt());

    }
    public static String returnString(String stringTobeModified){

        return "modified " + stringTobeModified;
    }
//    public static int returnInt(int number);
//        return num;


    }

