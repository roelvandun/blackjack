package com.philips;

public class Game {

    private Deck deck;

    public Game() {
        this.deck = new Deck();
    }

    public Player getPlayer1() {
        return new Player();
    }

    public Player getDealer() {
        return new Player();
    }

    public Deck getDeck() {
        return deck;
    }

    public void assignCard(Player player) {
        player.assignCard(deck.getCard());
    }
}
