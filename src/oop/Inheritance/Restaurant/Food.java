package oop.Inheritance.Restaurant;

public class Food {

    private String name;
    private double price;
    private String type;
    private String ingrediants;

    public Food(String name,  String type, String ingrediants,double price) {
        this.name = name;
        this.type = type;
        this.ingrediants = ingrediants;
        this.price = price;
    }
    public Food(String name, double price, String ingrediants){
        this.name = name;
        this.price = price;
        this.ingrediants = ingrediants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIngredients() {
        return ingrediants;
    }

    public void getIngredients(String ingrediants) {
        this.ingrediants = ingrediants;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", ingrediants='" + ingrediants + '\'' +
                '}';
    }
}
