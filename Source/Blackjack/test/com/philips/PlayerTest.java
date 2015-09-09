package com.philips;

import junit.framework.Assert;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertTrue;

public class PlayerTest {

    @Test
    public void itExists() throws Exception {
        assertNotNull(new Player());
    }

    @Test
    public void itCanReceiveCard() throws Exception {
        Player player = getPlayer();
        assertTrue(player.getCardsCount() == 1);
    }

    private Player getPlayer() {
        Player player = new Player();
        Card card = new Card(1);
        player.assignCard(card);
        return player;
    }

    @Test
    public void itHasCards() throws Exception {
        Player player = getPlayer();
        List<Card> cards = player.getCards();
        assertFalse(cards.isEmpty());
    }

    @Test
    public void itCalculatesScore() throws Exception {
        Player player = getPlayer();
        assertEquals(player.getScore(), 1);
        player.assignCard(new Card(2));
        assertEquals(player.getScore(), 3);
    }


}
