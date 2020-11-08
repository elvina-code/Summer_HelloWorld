package oop.Inheritance.Market;

import java.util.ArrayList;
import java.util.Arrays;

public class Store {
    private String nameOfStore;
    private Product [] products;

    public Store(String nameOfStore, Product[] product) {
        this.nameOfStore = nameOfStore;
        this.products = product;
    }

    public String getNameOfStore() {
        return nameOfStore;
    }

    public void setNameOfStore(String nameOfStore) {
        this.nameOfStore = nameOfStore;
    }


    public double calculateCostParticularProduct(int i){ // method calculate TotalCost of particular Product

        double cost =0;
        cost += products[i].cost();
        return  cost;
    }

    public double totalCostOfAllProduct() { // method calculate totalCost of all products in store
        double sum = 0;
        for (Product product : products) {
            sum += product.getCost() * product.getQuantity();
        }
        return sum;
    }

    public double applyDiscount(int i, double discount){ // method ApplyDiscount to some of the given products
        double finalCost = products[i].cost()- (products[i].cost()* discount/100);
        return finalCost;

    }

//    public void addProduct(Product product){
//        ArrayList<Product> l = new ArrayList<>();
//        for(Product p: l){
//            l.add()
//
//        }
//    }

    @Override
    public String toString() {
        return "Store{" +
                "nameOfStore='" + nameOfStore + '\'' +
                ", productList=" + Arrays.toString(products) +
                '}';
    }
}
