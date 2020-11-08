package HomeWork;

public class CheckOddEven {

    // public static void main(String [] args){

        /*int number = 49;

        System.out.println("the number is " + number);
            if (number % 2 == 0){
                System.out.println("even number");
            }else {
                System.out.println("Odd number");
            }*/
        public static boolean isOdd(int number){
            boolean result;

            if (number % 2 ==0){
                result = false;
            }else {
                result = true;
            }
            return result;

        }


    }
