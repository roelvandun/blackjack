package com.philips;

import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GameTest {

    @Test
    public void itExists() throws Exception {
        assertNotNull(new Game());
    }

    @Test
    public void itHasPlayers() throws Exception {
        Game game = new Game();
        Player player1 = game.getPlayer1();
        Player dealer = game.getDealer();
        assertNotNull(dealer);
        assertNotNull(player1);
    }

    @Test
    public void itHasADeck() throws Exception {
        Game game = new Game();
        assertNotNull(game.getDeck());
    }

    @Test
    public void itAssignCard() throws Exception {
        Game game = new Game();
        Player player1 = game.getPlayer1();
        int oldCount = player1.getCardsCount();
        game.assignCard(player1);
        int newCount = player1.getCardsCount();
        assertTrue(newCount == oldCount + 1);
    }
}
