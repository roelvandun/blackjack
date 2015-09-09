package com.philips;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class BlackJackTest {

    @Test
    public void testTheTruthIsTold() {
        assertTrue(true);
    }

    @Test
    public void itCanCreateDeck() {
        assertNotNull(new Deck());
    }

    @Test
    public void itCanCreateCard() {
        assertNotNull(new Card());
    }

    @Test
    public void itGetsCardFromDeck() {
        Deck deck = new Deck();
        Card card = deck.getCard();
        assertNotNull(card);
    }

}
