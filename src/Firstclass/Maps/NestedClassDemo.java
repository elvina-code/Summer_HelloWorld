package Firstclass.Maps;

public class NestedClassDemo {
    public static void main(String[] args) {
//        static methods can be used without initializing an object from the class
//        static classes are created only inside another class
//        and it only be used through the Upper class
        String key = NestedClass.Innerclass.getKey();
        System.out.println(key);
    }
}
