package oop.Car;

// object instance of class
public class CarDemo {
    public static void main(String[] args) {
        Car subaru = new Car(); // using Car class create oblect
        subaru.setModel("forester");
//        subaru.printX(); local variable arent accessible from different classes
        subaru.accelarate();
        System.out.println("model of subaru " + subaru.getModel());

        Car vw = new Car();
        vw.setModel("beetle");
        System.out.println("model of vw "+ vw.getModel());

        Car nn = new Car();
        System.out.println("Model of nn:"+nn.getModel());


        Car toyota = new Car("blue", "Toyota Japan", 2021);
        System.out.println("color " + toyota.getColor()+ " manufacturer " + toyota.getManufacturer()+ " year "+ toyota.getYear());


    }
}
