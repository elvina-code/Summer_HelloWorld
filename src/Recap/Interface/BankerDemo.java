package Recap.Interface;


import java.util.Scanner;

public class BankerDemo {

    //polymorphism can be used initializing an object when you decide
    public static void main(String[] args) {

//        Bank whateverBank;
//
//       System.out.println("Pls enter which bank account do you want to open");
//
//        String userChoice = new Scanner(System.in).nextLine();
//
//        switch (userChoice.toLowerCase()){
//            case "chase":
//                whateverBank = new Chase();
//                break;
//            case "bank of america":
//                whateverBank = new BankOfAmerica();
//                break;
//            default:
//                whateverBank = null;
//
//        }

//       whateverBank.deposit(1443);
//        System.out.println(whateverBank.getBalance());
//
//        Chase alexChaseAccount = new Chase();
//        alexChaseAccount.deposit(1000);
//
//        Chase belaChaseAccount = new Chase();
//        belaChaseAccount.deposit(2000);
//
//        transferFunds(alexChaseAccount, belaChaseAccount,800); // static
//
//        System.out.println(alexChaseAccount.getBalance());
//        System.out.println(belaChaseAccount.getBalance());
//
//        BankOfAmerica johnBOF = new BankOfAmerica();
//        johnBOF.deposit(2000); //2200
//
//        transferFunds(johnBOF, alexChaseAccount, 800);
//
//        System.out.println(johnBOF.getBalance());
//        System.out.println(alexChaseAccount.getBalance());

//        Chase userAccount = new Chase();
//        userAccount.setAccountNumber("123456789123");
//        System.out.println(userAccount.getAccountNumber());
//
//        userAccount.setRoutingNumber("123456789");
//        System.out.println(userAccount.getRoutingNumber());





    }
    // Putting interfaces types in params enable this Bank sender and recipient params(arguments) to be able to be used with any class that implements Bank interface.
    /**
     *
     * @param sender-> put bankAccount of sender
     * @param recipient -> put bankAccount of recipient
     */
    public static void transferFunds(Bank sender, Bank recipient, double transferAmount){ // Bank is data type of interfaces each of parameters can be chase or bof
        sender.withDraw(transferAmount);
        recipient.deposit(transferAmount);
    }


    /*Reqs:
    All BankTypes should include account number and routing numbers.
    When creating Chase or BankOfAmerica objects no duplicate account number or routing numbers should be allowed.
    All account numbers should be 12 digits long. and routing numbers should be 9 digits long.
    Create a OnePlatformBankManager class which will have List<Bank> as instance variable.
    And add method that will add a new bank to the list.
    and method that will transfer money from one account to another within the list.
    public void transfer(long accountFrom, long accountTo){
        both accounts should be present in the list.
        If they do then perform the transfer.
    }
   */


}
