package poker;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private final List<Card> hand = new ArrayList<>();

    public void generateHand() {
        Deck deck = new Deck();
        deck.reshuffle();
        int random = (int) (Math.random() * deck.getDeck().size());
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < deck.getDeck().size(); j++) {
                if (random == j) {
                    hand.add(deck.getDeck().get(j));
                    deck.getDeck().remove(j);
                }
            }
            random = (int) (Math.random() * deck.getDeck().size());
        }
    }
    public List<Card> getHand() {
        return hand;
    }
    public String printHand() {
        return "[ " + hand.get(0).getName() + hand.get(0).getColor() + ", " + hand.get(1).getName() + hand.get(1).getColor() + ", " +
       hand.get(2).getName() + hand.get(2).getColor() + ", " + hand.get(3).getName() + hand.get(3).getColor() + ", " +
        hand.get(4).getName() + hand.get(4).getColor() + " ]";
    }
}