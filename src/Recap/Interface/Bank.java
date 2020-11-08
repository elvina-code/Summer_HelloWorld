package Recap.Interface;
// create chase class which will be implement Bank interface
// it should have balance variable
// shouldn't let withdraw more then 1000
// shouldn't let deposit more then 10000
// shouldn't let withdraw or deposit negative values



public interface Bank {

// every class must implement abstract methods
    double getBalance();
    void deposit (double amount);
    void withDraw (double amount);



}
