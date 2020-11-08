package Exercises.OCA;

public class ProductDemo {
    public static void main(String[] args) {
        Product prdt = new Product();
        prdt.price = 200;
        double newPrice =100;

        ProductDemo productDemo = new ProductDemo();
        productDemo.updatePrice(prdt,newPrice);
        System.out.println(prdt.price + ":"+ newPrice);

    }
    public void updatePrice(Product product, double pricing){
        pricing =pricing*2;
        product.price = product.price + pricing;

    }
}
