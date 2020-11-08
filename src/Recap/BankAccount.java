package Recap;

public class BankAccount {
    public double sum;//-123123.00
    private int accountHolderAge;//20

    //scope -> age.
    public BankAccount(double sum, int age) {
        this.sum = sum;
        accountHolderAge = age;
    }

    public int getAccountHolderAge() {
        return accountHolderAge;
    }

    //should not do anything if the age is negative
    //
    public void setAccountHolderAge(int age) {

    }
}
