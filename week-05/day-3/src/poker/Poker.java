package poker;

public class Poker {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.reshuffle();
        Hand player1 = new Hand();
        Hand player2 = new Hand();
        player1.generateHand();
        player2.generateHand();
        System.out.println(player1.printHand());
        System.out.println(player2.printHand());
    }
}
