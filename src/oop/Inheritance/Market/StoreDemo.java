package oop.Inheritance.Market;

public class StoreDemo {
    public static void main(String[] args) {

        Product p1 = new Product("bread", 2.5, 10);
        Product p2 = new Product("milk", 3.5, 10);
        Product p3 = new Product("detergent", 10, 1);
        Product p4 = new Product("soup", 3.0, 5);
        Product [] products = {p1, p2, p3,p4};

        Store store = new Store("NetCost", products);
        System.out.println(store);

        System.out.println("total cost of all products "+ store.totalCostOfAllProduct());

        System.out.println("cost of particular product 1: "+ store.calculateCostParticularProduct(0)); // index

        System.out.println("after discount product 3 : " + store.applyDiscount(2, 10.0));





    }
}
