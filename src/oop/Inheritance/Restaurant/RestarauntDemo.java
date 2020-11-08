package oop.Inheritance.Restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class RestarauntDemo {


    ArrayList<User> userList = new ArrayList<>();

    ArrayList<Food> menuList = new ArrayList<>();

    public RestarauntDemo() {

        User user1 = new User("user1", "s3cr3t");
        User user2 = new User("user2", "s3cr4t");
        User user3 = new User("user3", "s3cr5t");
        this.userList.add(user1);
        this.userList.add(user2);
        this.userList.add(user3);

        Food appetizer1 = new Appetizer("appetizer1",10 , "ing1, ing2, ing3");
        Food appetizer2 = new Appetizer("appetizer2", 12, "ing1, ing2, ing3");
        Food appetizer3 = new Appetizer("appetizer3", 15, "ing1, ing2, ing3");

        menuList.add(appetizer1);
        menuList.add(appetizer2);
        menuList.add(appetizer3);

        Food mainDish1 = new MainDish("mainDish1", 20, "ing1, ing2, ing3");
        Food mainDish2 = new MainDish("mainDish2", 22, "ing1, ing2, ing3");
        Food mainDish3 = new MainDish("mainDish3", 25, "ing1, ing2, ing3");

        menuList.add(mainDish1);
        menuList.add(mainDish2);
        menuList.add(mainDish3);

        Food drink1 = new Drinks("drink1",  5, "ing1, ing2, ing3");
        Food drink2 = new Drinks("drink2",  6, "ing1, ing2, ing3");
        Food drink3 = new Drinks("drink3", 7, "ing1, ing2, ing3");

        menuList.add(drink1);
        menuList.add(drink2);
        menuList.add(drink3);
    }

    public static void main(String[] args){

        RestarauntDemo restaurantDemoApp = new RestarauntDemo();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username and password to login!");
        String username = input.next();
        String password = input.next();

        boolean loggedIn = restaurantDemoApp.login(username, password);
        if (loggedIn){
            printControl();
            int userControl = input.nextInt();
            switch (userControl){
                case 1:
                    for (Food f: restaurantDemoApp.menuList) {
                        if (f instanceof Appetizer) {
                            System.out.println(f);
                        }
                    }
                    break;
                case 2:
                    for (Food f: restaurantDemoApp.menuList) {
                        if (f instanceof MainDish) {
                            System.out.println(f);
                        }
                    }
                    break;
                case 3:
                    for (Food f: restaurantDemoApp.menuList) {
                        if (f instanceof Drinks) {
                            System.out.println(f);
                            System.out.println(((Drinks) f).getPrice(1000));
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid input!");
            }

        } else {
            System.out.println("Sorry, invalid password or username!");
        }

    }

    public static void printControl (){
        System.out.println("Enter (-1) to exit, and \n1.Appetizer\n2.MainDish\n3.Drinks");
    }

    public boolean login(String username, String password) {
        boolean isLoginSuccessful = false;
        for (User u: this.userList) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password))
                isLoginSuccessful = true;
        }
        return isLoginSuccessful;
    }

    public User login2(String username, String password) {
        User result = null;
        for (User u: this.userList) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password))
                result = u;
        }
        return result;
    }


}
