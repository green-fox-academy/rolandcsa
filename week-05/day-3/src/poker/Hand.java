package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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

    public boolean isFlush(Hand hand) {
        int heartCounter = 0;
        int diamondCounter = 0;
        int spadesCounter = 0;
        int clubsCounter = 0;
        for (Card card : hand.getHand()) {
            if (card.getSuit() == 'H') {
                heartCounter++;
            } else if (card.getSuit() == 'D') {
                diamondCounter++;
            } else if (card.getSuit() == 'S') {
                spadesCounter++;
            } else if (card.getSuit() == 'C') {
                clubsCounter++;
            }
        }
        return heartCounter == 5 || diamondCounter == 5 || spadesCounter == 5 || clubsCounter == 5;
    }

    public boolean isStraight(Hand hand) {
        Collections.sort(hand.getHand());
        for (int i = 0; i < 4; i++) {
            if (hand.getHand().get(i).getRank() + 1 != hand.getHand().get(i + 1).getRank()) {
                return false;
            }
        }
        return true;
    }

    public boolean isStraightFlush(Hand hand) {
        return isFlush(hand) && isStraight(hand);
    }

    private HashMap<Integer, Integer> countCard(Hand hand) {
        HashMap<Integer, Integer> cardCount = new HashMap<>();

        for (int i = 0; i < hand.getHand().size(); i++) {
            Card currentCard = hand.getHand().get(i);
            if (cardCount.containsKey(currentCard.getRank())) {
                int occurrences = cardCount.get(currentCard.getRank());
                cardCount.put(currentCard.getRank(), occurrences + 1);
            } else {
                cardCount.put(currentCard.getRank(), 1);
            }

        }
        return cardCount;
    }

    public boolean isFourOfAKind(Hand hand) {
        HashMap<Integer, Integer> cardCount = countCard(hand);
        for (Integer count : cardCount.values()) {
            if (count == 4) {
                return true;
            }
        }
        System.out.println(cardCount);
        return false;
    }
}