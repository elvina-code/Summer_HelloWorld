package oop.Cards;

import oop.Cards.Desk;

public class DeskDemo {
    public static void main(String[] args){
        Desk gameDeck = new Desk(56);
        System.out.println(gameDeck);

        gameDeck.shuffle();
        System.out.println(gameDeck);

    }


}
