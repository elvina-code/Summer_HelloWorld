package oop.Inheritance.Abstractclass;

public class Square extends Shape{

    private double side;

    public Square(){
        this.side =1.0;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "} " + super.toString();
    }

    @Override
    double getArea() {
        return side *side;
    }

    @Override
    double getPerimeter() {
        return 4 * side;
    }
}
