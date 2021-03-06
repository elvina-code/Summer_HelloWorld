package oop;

public class Rational {
    //1. Define a class called Rational. A Rational object should have two
    // integer instance variables that store the numerator and denominator.

    private int numerator;
    private int denominator;
    private int sign;

    //2. Write a constructor that takes no arguments and that sets the numerator
    //to 0 and denominator to 1.

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
        this.sign = getSign();
    }
    //7. Write a second constructor that takes two arguments and uses them to
    //    initialize the instance variables.
    public Rational(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        this.sign = getSign();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getSign() {
        double result = (double) this.numerator / (double) this.denominator; //casting

        return result < 0 ? -1 : 1; // turnary
    }
    //3. Write an instance method called printRational that displays a Rational
    //in some reasonable format.

    public void printRational(){
        System.out.println(this.numerator+" / "+this.denominator);
    }

    //6. Write a toString method for Rational and test it using println.
    @Override
    public String toString() {
        return numerator +" / "+ denominator;
    }

//    8. Write an instance method called negate that reverses the sign of a ra-
//    tional number. This method should be a modifier, so it should be void.
//    Add lines to main to test the new method. Need to calculate through getSign.
    public void negate(){
        this.sign = -1 * getSign();
    }
//9. Write an instance method called invert that inverts the number by
//    swapping the numerator and denominator. It should be a modifier. Add
//    lines to main to test the new method.
    public void invert (){
        int tmp = this.numerator;
        this.numerator = this.denominator;
        this.denominator = tmp;
    }
//    10. Write an instance method called toDouble that converts the rational
//number to a double (floating-point number) and returns the result. This
//method is a pure method; it does not modify the object. As always, test
//the new method.
    public double  toDouble(){
        return (double)numerator/ (double)denominator;
    }

//11. Write an instance method called add that takes a integer number as
// an argument, adds it to this, and returns a new Rational object.

    public void addInteger(int number){
        this.numerator = this.numerator + (number * denominator);
    }

}