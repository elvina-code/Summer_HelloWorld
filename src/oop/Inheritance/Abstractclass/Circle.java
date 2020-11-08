package oop.Inheritance.Abstractclass;

public class Circle extends Shape{

    private double radius;

    public Circle(){
        this.radius = 1.0;

    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius; //!!!!!!!!!!
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius; //!!!!!!!!!
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + this.radius +
                "} " + super.toString();
    }
}
