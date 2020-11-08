package HomeWork;



public class Swap {
    /*Write a program called Swap2Integers that prompts user for two integers. The program shall read the inputs as int,
    save in two variables called number1 and number2; swap the contents of the two variables; and print the results. For examples,
Enter first integer: 9
Enter second integer: -9
After the swap, first integer is: -9, second integer is: 9


     */
    public static void main(String[] args) {

        int number1 = 9;
        int number2 = -9;
        int temp = 0;
        System.out.println("Before swapping : number1, number2 = "+number1+", "+ + number2);

        temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("After the swap, first integer " + number1 + " second integer " +number2);

    }
}
