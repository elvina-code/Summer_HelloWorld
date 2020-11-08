package HomeWork;

import java.util.Scanner;

public class AreaOfTriangle {
/*Please calculate the area of a triangle. The user should enter width and height of the right triangle.
The formula is varied for different types of triangle, but the most common formula that was used as
Area=(Height x Base) /2

 */
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the width of the Triangle:");
    float width = scan.nextFloat();
    System.out.println("Enter the height of the Triangle:");

    float height = scan.nextFloat();
    float area = (height*width)/2 ;

    System.out.println("The are of triangle is "+ area);
}

}
