package Exercises;

public class WrapperClass {
    public static void main(String[] args) {
        int id =65;
        String idStr = Integer.toString(id);
        System.out.println(idStr);

        String price = "93.99";
        String discount = "100%";
        double priceDouble =Double.parseDouble(price);
        System.out.println(price);
        int discountInt = Integer.parseInt(discount.substring(0, discount.indexOf("%"))); // dicsount.length()-1
        double totalPay = priceDouble - (priceDouble * discountInt/100);
        System.out.println(totalPay);

        String appInfo = "INFO: APP version 3 is started";
        int version = Integer.parseInt(appInfo.substring(appInfo.indexOf("is")-2,appInfo.indexOf("is")-1)); //what if 10 regex
        System.out.println(version);

        double priceForCar = 12345.99;
        String priceWith$= "$" + Double.toString(priceForCar);
        System.out.println(priceWith$);

    }
}
