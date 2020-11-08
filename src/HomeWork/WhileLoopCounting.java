package HomeWork;

import java.util.Scanner;

public class WhileLoopCounting {
    /* Please try write a code that executes the below example with while loop.

Type in a message, and I'll display it five times.
Message: All work and no play makes Jack a dull boy.
1. All work and no play makes Jack a dull boy.
2. All work and no play makes Jack a dull boy.
3. All work and no play makes Jack a dull boy.
4. All work and no play makes Jack a dull boy.
5. All work and no play makes Jack a dull boy.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Type in a message, and I'll display it five times. ");

        System.out.println( "Message: " );

        String message= scanner.nextLine();

        int i = 0;

        while(i < 5){
            System.out.println( (i+1) + " . " + message );
            i++;
        }
    }
}
