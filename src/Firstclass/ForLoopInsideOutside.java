package Firstclass;

public class ForLoopInsideOutside {
    public static void main(String[] args) {
        System.out.println("this is if inside");
        for (int i = 1; i <= 10; i = i + 2) {
            int sum = 0; // this is inside
            sum += i;
            System.out.println(i);
            System.out.println(sum);
        }

        System.out.println("if this is outside");
        int sum = 0;// this is outside
        for (int i = 1; i <= 10; i = i + 2) {
            sum += i;
            System.out.println(i);
            System.out.println(sum);


        }
    }
}
