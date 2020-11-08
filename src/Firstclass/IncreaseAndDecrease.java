package Firstclass;

public class IncreaseAndDecrease {
    public static void  main(String [] args){
        int apples = 0;
        int grapes = 10;


        apples += 2; // apples = apples +1; --> 2
        grapes -= 2; // grapes = grapes -1; --> 8

        apples ++;  // apples = apples +1; --> 3
        grapes --; // grapes = grapes -1; --> 7

        System.out.println(apples);
        System.out.println (grapes);

        // Pre increment and post increment
        System.out.println("apples are:" + apples);
        System.out.println("grapes are:" + grapes);
        System.out.println("apples are pre inc" + (++apples));
        System.out.println("grapes are pre int" + (--grapes));

        System.out.println("apples are:" + apples);
        System.out.println("grapes are:" + grapes);
        System.out.println("apples are post inc" + (apples++));
        System.out.println("grapes are post int" + (grapes--));

        System.out.println("apples are:" + apples);
        System.out.println("grapes are:" + grapes);

        // Pre increment and post increment exercise
        int peaches = 7 ;
        int bananas = 5 ;
        int basket = bananas++ +1;
        System.out.println("bananas" + bananas + "peaches" + peaches + "bascket is" + basket);

        int mathsGrade = 50;
        int physicGrade = 75;
        int sum = --physicGrade + mathsGrade++; // 74+50
        int sum1 = mathsGrade-- + physicGrade++; // 51-- +74
        int totalSum = sum1 + sum;
        System.out.println("sum: "+sum+"\nsum1 :" + sum1 + "\nphysicGrade: "+physicGrade+ "\nmathsGrade: "+ mathsGrade+"\ntotalSum:"+totalSum); // 75 50

        int x = 5;
        int y = ++x * 5 / x-- + --x;
        System.out.println(y);



    }
}
