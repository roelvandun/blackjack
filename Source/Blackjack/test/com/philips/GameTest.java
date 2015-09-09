package com.philips;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
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
        Player player = game.getPlayer();
        Player dealer = game.getDealer();
        assertNotNull(dealer);
        assertNotNull(player);
    }

    @Test
    public void itHasADeck() throws Exception {
        Game game = new Game();
        assertNotNull(game.getDeck());
    }

    @Test
    public void itAssignCard() throws Exception {
        Game game = new Game();
        Player player = game.getPlayer();
        int oldCount = player.getCardsCount();
        game.dealCard(player);
        int newCount = player.getCardsCount();
        assertTrue(newCount == oldCount + 1);
    }

    @Test
    public void itPlaysWithTheSamePlayers() throws Exception {
        Game game = new Game();
        assertEquals(game.getPlayer(), game.getPlayer());
        assertEquals(game.getDealer(), game.getDealer());
    }

    @Test
    public void itDealsCardsAtStart() throws Exception {
        Game game = new Game();
        assertEquals(game.getPlayer().getCardsCount(), 2);
        assertEquals(game.getDealer().getCardsCount(), 2);
    }

//    @Test
//    public void itCanDecideWinner() throws Exception {
//        Game game = new Game();
//        game.dealCard(game.getPlayer());
//        game.
//    }
}
