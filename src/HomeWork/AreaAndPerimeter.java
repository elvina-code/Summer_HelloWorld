package HomeWork;

public class AreaAndPerimeter {
    /* Width = 5.5 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60 ??
Perimeter is 2 * (5.6 + 8.5) = 28.20

		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);

        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);

     */

    public static void main(String [] args){
        float width = 5.6f;
        float height = 8.5f;
        float perimeter = 2*(height + width);
        float area = width * height;
        System.out.println("Area is " +width+ "*" +height+ "=" +area);
        System.out.println(("Perimeter is " + "2*(" + width + "+" + height + ")=" + perimeter));
    }
}
