package Exercises;

public class PracticeForLoop {
    public static void main(String[] args) {

        int sum =0;

        for (int i = 1; i < 10; i++) {
            if(isEven(i)){
                System.out.println(i);
                sum +=i;
            }else{
                System.out.println("odd");
            }

        }
        System.out.println(sum);
    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
}
