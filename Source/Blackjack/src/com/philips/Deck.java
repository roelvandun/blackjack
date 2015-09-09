package com.philips;

public class Deck {
    Card[] cards = new Card[52];

    public Deck() {
        for (int i = 0 ; i < cards.length; ++i) {
            cards[i] = new Card(i);
        }
    }

    public Card getCard() {
        return new Card(0);
    }

    public int getCardCount() {
        return cards.length;
    }
}
