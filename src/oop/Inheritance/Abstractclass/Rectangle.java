package oop.Inheritance.Abstractclass;

public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle() {
        this.length = 1.0;
        this.width =1.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return length;
    }

    public void setHeight(double length) {
        this.length = length;
    }



    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimeter() {
        return 2 * length + 2 * width;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + this.width +
                ", length=" + this.length +
                "} " + super.toString();
    }
}
