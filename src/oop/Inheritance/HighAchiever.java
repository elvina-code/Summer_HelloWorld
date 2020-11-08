package oop.Inheritance;

// to send info about high achieving students


public class HighAchiever extends Student {

    private double gpa;
    public  HighAchiever(String name, int rollNo, double gpa){
        super(name, rollNo);
        this.gpa = gpa;

    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}