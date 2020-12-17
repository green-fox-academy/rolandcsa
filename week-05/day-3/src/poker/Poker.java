package poker;

public class Poker {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.reshuffle();

        Hand player1 = new Hand("player1");
        Hand player2 = new Hand("player2");
        Hand player3 = new Hand("player3");

        player1.generateHand(deck);
        player2.generateHand(deck);
        player3.generateHand(deck);

        System.out.println(player1.printHand());
        System.out.println(player2.printHand());
        System.out.println(player3.printHand());
    }
}
