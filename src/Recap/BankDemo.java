package Recap;

public class BankDemo {
    public static void main(String[] args) {
        BankAccount bankUser1 = new BankAccount(1000.00, -20);
        System.out.println(bankUser1.sum);
        bankUser1.sum = -123123.00;
        int x = 0;
        x = 23+45;
        System.out.println("Hello World");
        System.out.println(bankUser1.sum);//-123123.00
//        System.out.println(bankUser1.age);//doesnt compile.
        System.out.println(bankUser1.getAccountHolderAge());//0
        bankUser1.setAccountHolderAge(-234);
        System.out.println(bankUser1.getAccountHolderAge());//still 0
        bankUser1.setAccountHolderAge(24);
        System.out.println(bankUser1.getAccountHolderAge());//24
        //both contractor and setter method should not allow more than 120;
    }
    }





