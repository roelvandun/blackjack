package com.philips;

public class Deck {

    private int drawnCardIndex;
    Card[] cards = new Card[52];

    public Deck() {
        drawnCardIndex = 0;
        for (int i = 0 ; i < cards.length; ++i) {
            cards[i] = new Card(i);
        }
    }

    public Card getCard() {
        return cards[drawnCardIndex++];
    }

    public int getCardCount() {
        return cards.length;
    }
}
