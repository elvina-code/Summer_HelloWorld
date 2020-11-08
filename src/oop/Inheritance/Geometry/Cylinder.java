package oop.Inheritance.Geometry;

import oop.Inheritance.Geometry.Circle;

public class Cylinder extends Circle {

   private int height;

    public Cylinder(int radius, String color, int height) { // only initiate
        super(radius, color); // came from superclass
        this.height = height; // intiatiate differ from line 5
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Double getVolume(){
        return height * super.getArea();
    }

    @Override
    public Double getArea() {
        return  (2*Math.PI * getRadius() * height) + (2 * Math.PI * getRadius() * getRadius());
    }

}
