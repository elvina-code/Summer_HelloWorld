package oop;

public class Circle {

    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public double getRadius() {
        return this.radius;
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color= color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public String getColor(){
        return this.color;
    }
    public void setRadius(double newRadius){
        this.radius = radius;

    }
    public void setColor(String  newColor){
        this.color = color;

    }
}
