package HomeWork;
//Write a function int fib(int n) that returns Fn.
// For example, if n = 0, then fib() should return 0. If n = 1, then it should return 1. For n > 1, it should return
//Fn = Fn-1 + Fn-2
public class FibonacciMethod {
    public static void main(String[] args) {
    int i = 9;
        System.out.println(fib(i));
    }

    /*static int fib(int n) {
        if (n <= 1) {
            return n;
        }else{
            return fib(n - 1) + fib(n - 2);
        }

    }*/
    static int fib(int n) {
        /* Declare an array to store Fibonacci numbers. */
        int f[] = new int[n+2]; // 1 extra to handle case, n = 0
        int i;

        /* 0th and 1st number of the series are 0 and 1*/
        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++) {
       /* Add the previous 2 numbers in the series and store it */
            f[i] = f[i-1] + f[i-2];
        }

        return f[n];
    }
}
