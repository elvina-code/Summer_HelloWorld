package Recap.Interface;

public class BankOfAmerica extends BankBase{

    private double balance = 200;// opened account with bonus

    public BankOfAmerica(long accountNumber, long routingNumber) throws Exception {
        super(accountNumber, routingNumber);
        addToAccountStorage(this);
    }




    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0 || amount > 20000) {
            System.err.println("Invalid number, can not be deposited");
        } else {
            balance += amount;// current value and add a new amount to update new value
        }


    }

    @Override
    public void withDraw(double amount) {
        if (amount < 0 || amount > 5000) {
            System.err.println("Invalid number, can not be withdrawn");
        } else {
            if (balance < amount) {
                System.err.println("Insufficient funds");
            } else {
                balance -= amount;
            }

        }
    }

    }



