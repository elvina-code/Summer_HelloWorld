package oop;

public class Car1 {
    private String color;
    private String make;
    private int year;
    private double mileage;

    //constructor is needed to initialize an object with the intial values of properties.
    public Car1(String color, String make, int year, double mileage)
    {
        this.color = color;
        this.make = make;
        this.year = year;
        this.mileage = mileage;
    }
    //instance methods are behavior of objects.
    public void drive(double mileage)
    {
        setMileage(mileage + this.mileage);
//        setMileage(getMileage()+ mileage); unless
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    public double getMileage() {
        return this.mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void paint( String color){
        setColor(this.color = color);
    }
}


