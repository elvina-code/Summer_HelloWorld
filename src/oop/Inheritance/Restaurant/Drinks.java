package oop.Inheritance.Restaurant;

public class Drinks extends Food {
//    private double quantity;

    public Drinks(String name, double price, String ingrediants) {
        super(name, price, ingrediants);

    }

//    @Override
    public double getPrice(int quantity){
        return quantity * super.getPrice();
    }

    @Override
    public String toString() {
        return "Drinks{} " + super.toString();
    }
}
