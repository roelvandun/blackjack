package com.philips;

public class Game {

    private final Player player;
    private final Player dealer;
    private Deck deck;

    public Game() {
        this.deck = new Deck();
        player = new Player();
        dealer = new Player();
        dealInitialCards();
    }

    private void dealInitialCards() {
        dealCard(player);
        dealCard(player);
        dealCard(dealer);
        dealCard(dealer);
    }

    public Player getPlayer() {
        return player;
    }

    public Player getDealer() {
        return dealer;
    }

    public Deck getDeck() {
        return deck;
    }

    public void dealCard(Player player) {
        player.assignCard(deck.getCard());
    }
}
