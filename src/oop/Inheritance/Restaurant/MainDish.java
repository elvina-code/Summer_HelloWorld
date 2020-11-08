package oop.Inheritance.Restaurant;

public class MainDish extends Food{

    public MainDish(String name, double price, String ingrediants) {
        super(name, price, ingrediants);
    }

    @Override
    public String toString() {
        return "MainDish{} " + super.toString();
    }
}
