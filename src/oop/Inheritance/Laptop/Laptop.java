package oop.Inheritance.Laptop;



public class Laptop {
    private String company;
    private String model;
    private String color;
    private double weight;
    private String owner;

    public Laptop(String company, String model, String color, double weight, Owner owner) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.owner = owner.getFullName();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOwner() {
        return owner;
//        this.owner = owner.getFullName;
    }

    public void setOwner(Owner owner) {
        this.owner = owner.getFullName();
    }
}
