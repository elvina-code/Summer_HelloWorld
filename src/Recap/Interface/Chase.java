package Recap.Interface;

public class Chase extends BankBase{

//    You should have a mechanism which keeps track of all bank accounts created, both chase and BOA.
//    Accounts with duplicate account numbers and/or routing numbers should not be allowed.

    private double balance = 0;

    public Chase(long accountNumber, long routingNumber) throws Exception {
        super(accountNumber, routingNumber);
        addToAccountStorage(this);

    }


    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0 || amount > 10000) {
            System.err.println("Invalid number, can not be deposited");
        } else {
            balance += amount;// current value and add a new amount to update new value
        }

    }

    @Override
    public void withDraw(double amount) {
        if (amount < 0 || amount > 1000) {
            System.err.println("Invalid number, can not be withdrawn");
        } else {
            if (balance < amount) {
                System.err.println("Insufficient funds");
            } else {
                balance -= amount;
            }

        }
    }

//    public void setAccountNumber(String accountNumber) {
//        if(accountNumber.length() > 12 || accountNumber.length()< 12){
//
//            this.accountNumber = ("Account number should be 12 digits long");
//
//        }else{
//            if(accountNumber.equals(routingNumber)){
//                this.accountNumber = ("No duplicate numbers are allowed");
//            }
//            this.accountNumber = accountNumber;
//        }
//    }
//    public void setRoutingNumber(String routingNumber) {
//        if(routingNumber.length() > 9 || routingNumber.length() <9){
//            this.routingNumber = ("Routing number should be 9 digits long");
//        }else {
//            if(routingNumber.equals(accountNumber)){
//                this.routingNumber = ("No duplicate numbers are allowed");
//            }
//            this.routingNumber = routingNumber;
//        }
//    }
}
