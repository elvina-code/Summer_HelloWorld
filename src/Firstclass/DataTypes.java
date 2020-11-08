package Firstclass;

public class DataTypes {
    //int numberOfWeeksInAMonths = 7;//class variable

    public static void main(String[] args){

       // int numberOfStudents = 35;

        // whole numbers:

        byte myByte = -126; // 1 byte -128 to 127
        short myShort = 31000; // 2 bytes -32000 t0 32000
        int myInteger = 2147483647; //2 billion -2147483648 to 2147483647

        int numberOne = 10;
        int numberTwo = 15;
        int numberThree = numberOne + numberTwo;


        long myLong = 9; // 98876543l
        System.out.println("My long before change " + myLong);

        myLong = myLong + 5;
        System.out.println("My long after change " + myLong);
        System.out.println("My Long + My Long " + (myLong + myLong));



        // demical numbers:

        double myDouble = 6.0;
        float myFloat = 6.0f;

        boolean myBoolean = true;// true or false
        char myChar = '1'; // M, 2,
        char a =65;


        System.out.println("A is " + a);
        System.out.println("myDouble / 3.1 = " +myDouble/3.1);
        System.out.println("myFloat / 3.1 = " +myFloat/3.1f);

        System.out.println("someText\tsomeText\tsomeText\nsomeText\tsomeText\tsomeText\n");













        }
    }

