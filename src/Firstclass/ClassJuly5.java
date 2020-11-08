package Firstclass;
import java.util.Scanner;

public class ClassJuly5 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        /* int x = scanner.nextInt();
        System.out.println("Please enter first integer:");
        int y = scanner.nextInt();
        System.out.println("Please enter second integer:");
        if(x !=y){
            System.out.println(x + y);
        }else {
            System.out.println(2*(x+y));

        }
    } */
        /* if age >= 5 --> enter
            if age between  (inclusive) 10 to 15 (exlusive)--> enter teenage
            if age > 15--> do not enter
            all others --> sorry
         */
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();

        if (age >= 5 && age < 10){
            System.out.println("Enter");
        } else if (age >= 10 && age <15) {
            System.out.println("Enter teenage");
        } else if (age >15) {
            System.out.println("Do not enter");
        } else
            System.out.println("Sorry");

        }

    public static class ClassBaha {
        public static void main(String [] args){
            Scanner scanner = new Scanner(System.in);

            String myName;
            String lastName;
            int age;
            double height;

            System.out.println("Print your name:");
            myName = scanner.nextLine();
            System.out.println("Print your lastName:");
            lastName = scanner.nextLine();
            System.out.println("Print your age:");
            age = scanner. nextInt();
            System.out.println("Print your height:");
            height = scanner.nextDouble();


            System.out.println("Name: " +myName+ " Last name: " +lastName+ " age: " +age+ " height: " +height);


        }

    }
}




