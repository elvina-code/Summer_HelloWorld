package HomeWork;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FourReturnTypeMethods {

    /*Please write 4 different return type methods for the Calculator class

input numbers  are int a=21;  int b=3;

a) addNumbers(a,b)
b) divideNumbers(a,b)
c) multiplyNumbers(a,b)
d) subtractNumbers(a,b)

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println("the products " + multilyNumbers(a, b));
        System.out.println("the sum " + addNumbers(a, b));
        System.out.println("the difference " + subtractNumbers(a, b));
        System.out.println("the division " + divideNumbers(a, b));
    }


    public static double multilyNumbers(double a, double b) {

        return (a * b);
    }
    public static double addNumbers(double a, double b){

        return ( a+ b);
    }
    public static double subtractNumbers(double a, double b){

        return ( a - b);
    }
    public static double divideNumbers(double a, double b)
    {
        return ( a/ b);
    }
}







