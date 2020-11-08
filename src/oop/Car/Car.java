package oop.Car;



// create class with method
// this is a plan that needs to be used for every car object(necessary info for the car)
public class Car {
//    instance variable(general belongs to class):
//    access modifier can be access if they declared as public, private, protected, default
//    have default values

    protected int year;
    private String model;
    private String color;
    private int speed;
    private String manufacturer;
    private long mileage;
    private double price;


//    user of this class is CarDemo
//    constructor needs to be named same as class name caseSensitive
//    doesnt have return type
//    is used to initialize instance variable
//    is used to give the object initial state
    public Car(int carYear, long carMillage, String carModel, double carPrice){
        year = carYear;
        mileage = carMillage;
        model = carModel;
        price = carPrice;

    }
    public Car(){
        this.model = "chevrolet";
        this.color = "blue";

    }
    public String getModel(){
        return this.model;
    }

    public void setModel(String m){
        model = m;
        int counter = 0; // local variable belongs to this method
    }
    public Car(String color, String manufacturer, int year){ // contructors overloading
        this.color =color;
        this.manufacturer = manufacturer;
        this.year = year;



    }
    public Car(String color, int year){ // constructor chaining
        this(color, "", 2001);
//        this.color =color;
//        this.year = year;
    }
// public means can be access outside of class
    public void accelarate(){
        speed++;

    }
    public void decelarate(){
        accelarate();
        speed--;

    }

    public String getColor(){
        return color;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public int getYear(){
        return year;
    }
//    public int getYear(){
//        year =1;
//        printX();
//        return year;
//    }
//
//    public void printX(){
//        System.out.println("X");
//    }

}
