package Firstclass;

public class OuterInnerLoop {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);// print
            }
            System.out.println();// println
        }

        /*for(int i = 10; i > 0; i --){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

        for(int i =0; i < 3; i ++){
            for(int j = 0; j < 3; j ++){
                System.out.print("#");
            }
        }
        System.out.println();
    }
}
