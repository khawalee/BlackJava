package ca.sheridancollege.project;

public class BlackjackGame extends Game {

    private GroupOfCards deck;
    private BlackjackPlayer dealer;
    private BlackjackPlayer player;

    public BlackjackGame(String name) {
        super(name);
        deck = new GroupOfCards(52);
        deck.initializeDeck();
        dealer = new BlackjackPlayer("Dealer");
        player = new BlackjackPlayer("Player");
    }

    @Override
    public void play() {
        deck.shuffle();
        dealInitialCards();
        player.play();
        playDealerTurn();
        declareWinner();
    }

    private void dealInitialCards() {
        player.addCard(deck.dealCard());
        dealer.addCard(deck.dealCard());
        player.addCard(deck.dealCard());
        dealer.addCard(deck.dealCard());
    }

    private void playDealerTurn() {
        while (dealer.getHandValue() < 17) {
            dealer.addCard(deck.dealCard());
        }
    }

    @Override
    public void declareWinner() {
        // Compare hand values and determine the winner
    }

    public static void main(String[] args) {
        BlackjackGame game = new BlackjackGame("BlackJava");
        game.play();
    }
}
