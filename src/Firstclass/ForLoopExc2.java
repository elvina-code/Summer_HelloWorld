package Firstclass;

public class ForLoopExc2 {
    public static void main(String[] args) {
        long powerOfNum = power(5,3);
        System.out.println(powerOfNum);
    }
    public static long power(long number, int p){
        long result =1;
        for(int i =1; i<=p; i++){
            result *= number;
        }
        return result;
    }
}
