package poker;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private final String playerName;
    private final List<Card> hand = new ArrayList<>();

    public Hand(String playerName) {
        this.playerName = playerName;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void generateHand(Deck deck) {
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

    public String printHand() {
        StringBuilder result = new StringBuilder(" [ ");

        for (Card card : hand) {
            result.append(card.getName());
            result.append(card.getSuit());
            result.append(", ");
        }
        result.deleteCharAt(result.length() - 2);
        result.append("]");
        return result.toString();
    }
}