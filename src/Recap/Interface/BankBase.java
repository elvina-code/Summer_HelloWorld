package Recap.Interface;

import java.util.HashSet;
import java.util.Set;

public abstract class BankBase implements Bank{

    private long accountNumber;
    private long routingNumber;

    // Set belongs to class, make it static we want to add the value only when we create the object right away.
    public static Set<BankBase> accountStorage = new HashSet<>();

    // can not use static , can not use set getter and setter,  open account we need create constructor
    // parseInt = Integer to String
    // Long -->String = Long.toString
    // method throw exception to forcing by some condition we need to add to method

    public BankBase(long accountNumber, long routingNumber) throws Exception {
        if(Long.toString(accountNumber).length() == 12) {
            this.accountNumber = accountNumber;
        }else{
            throw new Exception("must have been 12 digits numbers");
        }
        if(Long.toString(routingNumber).length() == 9){
            this.routingNumber = routingNumber;
        }else{
            throw new Exception("must have been 9 digits numbers");
        }

    }
    // bb object how we can reach account number
    // command option a =

    public static void addToAccountStorage(BankBase account)throws Exception {
        if (accountStorage.size() != 0) {
            for (BankBase bb : accountStorage) {
                if (bb.accountNumber == account.accountNumber) {
                    throw new Exception("account number " + account.accountNumber + "already exits");
                } else if (bb.routingNumber == account.routingNumber) {
                    throw new Exception("routing number " + account.accountNumber + "already exits");
                } else {
                    accountStorage.add(account);
                }
            }
        }else{
                accountStorage.add(account);
            }
        }
    }


