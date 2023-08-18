package ca.sheridancollege.project;

public class Card {

    private int value;
    private String suit;

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
