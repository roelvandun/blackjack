package com.philips;

import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertTrue;

public class PlayerTest {

    @Test
    public void itExists() throws Exception {
        assertNotNull(new Player());
    }

    @Test
    public void itHasCards() throws Exception {
        Player player = new Player();
        assertTrue(player.getCardsCount() == 0);
    }

    @Test
    public void itCanReceiveCard() throws Exception {
        Player player = new Player();
        Card card = new Card(1);
        player.assignCard(card);
        assertTrue(player.getCardsCount() == 1);
    }
}
