package ca.sheridancollege.project;

import java.util.ArrayList;

public class BlackjackPlayer extends Player {

    private ArrayList<Card> hand;

    public BlackjackPlayer(String name) {
        super(name);
        hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public int getHandValue() {
        // Calculate and return the hand value
        return 0;
    }

    @Override
    public void play() {
        // Implement player's turn logic
    }
}
