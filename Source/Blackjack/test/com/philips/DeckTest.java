package com.philips;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {

    @Test
    public void itCanCreateDeck() {
        assertNotNull(new Deck());
    }

    @Test
    public void itGetsCardFromDeck() {
        Deck deck = new Deck();
        Card card = deck.getCard();
        assertNotNull(card);
    }

    @Test
    public void itHas52cards() throws Exception {
        Deck deck = new Deck();
        assertTrue(deck.getCardCount() == 52);
    }

    @Test
    public void itDoesNotHaveTwoIdenticalCards() {
        Deck deck = new Deck();
        Card firstCard = deck.getCard();
        Card secondCard = deck.getCard();
        assertFalse(firstCard.getIndex() - secondCard.getIndex() == 0);
    }

}
