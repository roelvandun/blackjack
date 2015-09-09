package com.philips;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> cards = new ArrayList<>();

    public int getCardsCount() {
        return cards.size();
    }

    public void assignCard(Card card) {
        cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getScore() {
        int score = 0;
        for (Card card : cards) {
            score += card.getValue();
        }
        return score;
    }
}
