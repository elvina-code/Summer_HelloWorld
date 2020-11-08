package Firstclass;

public class WhileLoop {
    public static void main(String[] args) {
        int counter = 1;

        while (counter <= 10) {

           /* if (counter % 2 == 0) {
                System.out.println(counter + "<<Even");

            } else {
                System.out.println(counter + ">>Odd");
            }
            counter++;
            */
            isEvenOrOdd(counter);
            counter++;
            System.out.println("sum of 5 to 10 " +sumOfNumberInRange(5,10));

        }
    }
        public static void isEvenOrOdd(int number){
            if (number % 2 == 0) {
                String result = number + "is even number";
                System.out.println(result);
            } else {
                System.out.println(number + "is odd number");
            }
        }
        public static int sumOfNumberInRange(int start, int end){
        int result =0;
        int counter = start;
        while(counter <= end){
            result=result+counter;
            counter ++;
        }
        return result;
        }
    }


