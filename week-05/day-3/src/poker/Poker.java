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
        player3.getHand().add(new Card('T', 'H'));
        player3.getHand().add(new Card('T', 'C'));
        player3.getHand().add(new Card('6', 'D'));
        player3.getHand().add(new Card('Q', 'S'));
        player3.getHand().add(new Card('Q', 'S'));

        System.out.println(player1.printHand());
        System.out.println(player2.printHand());
        System.out.println(player3.printHand());
        System.out.println(player3.isFlush());
        System.out.println(player3.isStraight());
        System.out.println(player3.isStraightFlush());
        System.out.println(player3.isFourOfAKind());
        System.out.println(player3.isThreeOfAKind());
        System.out.println(player3.isPair());
        System.out.println(player3.isTwoPairs());
    }
}
