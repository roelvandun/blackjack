package com.philips;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CardTest {

    @Test
    public void itCanCreateCard() {
        assertNotNull(new Card());
    }

    @Test
    public void itHasIndex() throws Exception {
        Card card =  new Card();
        assertTrue(card.getIndex() > 0);
        assertTrue(card.getIndex() < 14);
    }
}
