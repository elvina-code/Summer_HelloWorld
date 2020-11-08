package HomeWork;
//Area of rectangle : a*b 
//Perimeter of ractangle: 2*(a + b)


import java.util.Scanner;

public class AreaTriangleMethod {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num1 =scanner.nextInt();
        int num2 =scanner.nextInt();

        System.out.println("Area is " + areaRect(num1, num2));
        System.out.println("Perimeter is "+ perimeterRect(num1,num2));
    }

    private static int perimeterRect(int a, int b) {
        int rect = 2*(a+b);
        return rect;
    }

    public static int areaRect(int a, int b){
        int area=a*b;
        return area;
    }
    
}
