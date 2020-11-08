package HomeWork;

public class FibonacciLoop {
    public static void main(String[] args) {
        int count = 9;
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci of " + count + " numbers:");

        for (int i = 1; i <= count; ++i) {
            int sumOfPrevTwo = a + b;
            a = b;
            b = sumOfPrevTwo;
        }
        System.out.println(a + " ");
    }
}
