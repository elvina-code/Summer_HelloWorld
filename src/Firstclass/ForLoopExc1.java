package Firstclass;

public class ForLoopExc1 {
    public static void main(String[] args) {
        printMultTable(8);

    }
    public static void printMultTable(int number){
        for(int i =0; i <=10; i++){
            System.out.println(number+ "x" +i+ "="+(number *i));
        }
    }
}
