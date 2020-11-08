package oop.Inheritance.Restaurant;

public class Appetizer extends Food{

    public Appetizer(String name,  double price,  String ingrediants) {
        super(name, price, ingrediants);

    }

    @Override
    public String toString() {
        return "Appetizer{} " + super.toString();
    }
}
