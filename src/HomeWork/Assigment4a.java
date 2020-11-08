package HomeWork;

public class Assigment4a {
    /* Write a Java program to print the area and perimeter of a circle.
Test Data:

Note: The radius should be entered by keyboard.

Formula:   Perimeter=2*radius*3.14;              Area=3.14*radius*radius;
final float pi = 3.14f; or Math.PI

Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586

     */
    public static void main(String [] args){
        double radius = 7.5;
        final float pi = 3.14f;
        double perimeter = 2 * radius* pi ;
        double area = pi * radius * radius;

        System.out.println("Perimeter= " +perimeter);
        System.out.println("Area= " +area);

    }
}
