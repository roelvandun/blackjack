package com.philips;

public class Game {

    private final Player player;
    private final Player dealer;
    private Deck deck;

    public Game() {
        this.deck = new Deck();
        player = new Player();
        dealer = new Player();
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

    public void assignCard(Player player) {
        player.assignCard(deck.getCard());
    }
}
