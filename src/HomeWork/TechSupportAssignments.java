package HomeWork;
import java.util.Scanner;
/* Exercise 1: Write Java program to allow the user to input two float values and then the program adds the two values together. The result will be assigned to the first variable.
Ex:
Enter value a:12.5
The value of a before adding is 12.5.
Enter value b:34.9
The value of a after adding is 47.4.

     */

public class TechSupportAssignments {
    public static void main(String [] args){
        Scanner userInput = new Scanner (System.in);

        System.out.println("enter value a:");
        float a = userInput.nextFloat();

        System.out.println("enter value b:");
        float b = userInput.nextFloat();

        System.out.println("The value after adding is " + (a = a + b));









    }


    public static class Exercise2 {

        /* Exercise 2: Write Java program to allow the user to input his/her age. Then the program will show if the person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old.
    Ex:
    Enter your age: 18
    You are eligible to vote.

         */
     public static void main(String [] args){

         Scanner userInput = new Scanner (System.in);

         System.out.println("Please enter your age:");
         int age = userInput.nextInt();

         //boolean iseligible = (age >= 18);
         //System.out.println("you are "+age+" is eligible to vote" +iseligible);

        if(age >= 18){
            System.out.println("You are eligible to vote!");
        }
        else
            System.out.println("You are not eligible to vote!");




     }
    }

    public static class Exercise3 {
        /*Exercise 3: Write a Java program to input and display your password.
    Expected Output
    Input your Password:
    Your password was: abc@123

         */
        public static void main(String[] args){
            Scanner input = new Scanner (System.in);

            System.out.println("Enter your password:");
            String password = input.nextLine();
            System.out.println("Your password was:" +password);
        }

    }

    public static class Exercise4 {
        /* Exercise 4: Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
    Sample Output:
    Input the first number : 5
    Input the second number: 10
    Input the third number : 15
    The result is: true

         */
        public static void main(String[] args){
            int a = 5;
            int b = 10;

            int c = 15;

            // boolean result = c ==(a + b);
            //System.out.println(" the result is " +result);

            if(c == (a+b)){ // ==, >=, <=
                System.out.println(true);

            } else
                System.out.println(false);
        }
    }

    public static class Exercise5{
        public static void main(String [] args){
            int time = 17;
            String result =(time<18) ? "Good day" : "Good evening";// REMEMBER short hand if...eslse statement ()?:
            if(time<18){
                System.out.println("Good day");
            }else if(time>18){
                System.out.println("Good evening");
            }


        }
    }
}
