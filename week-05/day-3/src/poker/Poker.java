package poker;

public class Poker {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.reshuffle();
        Hand player1 = new Hand("player1");
        Hand player2 = new Hand("player2");
        Hand player3 = new Hand("player3");
        Hand player4 = new Hand("player4");
        player1.generateHand(deck);
        player2.generateHand(deck);
        player4.generateHand(deck);
        player3.getHand().add(new Card('A', 'C'));
        player3.getHand().add(new Card('A', 'D'));
        player3.getHand().add(new Card('A', 'H'));
        player3.getHand().add(new Card('7', 'S'));
        player3.getHand().add(new Card('A', 'S'));

        System.out.println(player1.printHand());
        System.out.println(player2.printHand());
        System.out.println(player3.printHand());
        System.out.println(HandStrength.isFlush(player3));
        System.out.println(HandStrength.isStraight(player3));
        System.out.println(HandStrength.isStraightFlush(player3));
        System.out.println(HandStrength.isFourOfAKind(player3));
        System.out.println(HandStrength.isThreeOfAKind(player3));
        System.out.println(HandStrength.isPair(player3));
    }
}
