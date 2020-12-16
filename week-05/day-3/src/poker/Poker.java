package poker;

public class Poker {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.reshuffle();
        Hand player1 = new Hand("player1");
        Hand player2 = new Hand("player2");
        Hand player3 = new Hand("player3");
        player1.generateHand();
        player2.generateHand();
        player3.getHand().add(new Card('A', 'S'));
        player3.getHand().add(new Card('2', 'S'));
        player3.getHand().add(new Card('3', 'S'));
        player3.getHand().add(new Card('4', 'S'));
        player3.getHand().add(new Card('5', 'S'));

        System.out.println(player1.printHand());
        System.out.println(player2.printHand());
        System.out.println(player3.printHand());
        System.out.println(HandStrength.isFlush(player3));
        System.out.println(HandStrength.isStraight(player3));
        System.out.println(HandStrength.isStraightFlush(player3));
    }
}
