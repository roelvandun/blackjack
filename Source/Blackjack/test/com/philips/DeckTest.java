package com.philips;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

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

}
