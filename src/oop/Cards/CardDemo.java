package oop.Cards;

import oop.Car.Car;
import oop.Cards.Card;

import java.util.Random;

public class CardDemo {
    public static void main(String[] args){

        Random rnd = new Random();// can not generate random in string that's why we taking int

        Card myCard = new Card(rnd.nextInt(4), rnd.nextInt(14));
        Card myCard1 = new Card(3,11);

        System.out.println(myCard);
        System.out.println("--"+ myCard1);

        for (int i = 0; i < 10; i++) {
            Card tempCard = new Card(rnd.nextInt(4), rnd.nextInt(14));
            System.out.println(tempCard);
            System.out.println(myCard.equals(tempCard));
        }


    }
}
