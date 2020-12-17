package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Hand {
    private final String playerName;
    private final List<Card> hand = new ArrayList<>();
    private final HashMap<Integer, Integer> sameCardRankCount = countSameCardRank();

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

    public boolean isFlush() {
        int heartCounter = 0;
        int diamondCounter = 0;
        int spadesCounter = 0;
        int clubsCounter = 0;
        for (Card card : getHand()) {
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

    public boolean isStraight() {
        Collections.sort(getHand());
        for (int i = 0; i < 4; i++) {
            if (getHand().get(i).getRank() + 1 != getHand().get(i + 1).getRank()) {
                return false;
            }
        }
        return true;
    }

    public boolean isStraightFlush() {
        return isFlush() && isStraight();
    }

    private HashMap<Integer, Integer> countSameCardRank() {
        HashMap<Integer, Integer> sameCardRankCount = new HashMap<>();

        for (int i = 0; i < getHand().size(); i++) {
            Card currentCard = getHand().get(i);
            if (sameCardRankCount.containsKey(currentCard.getRank())) {
                int occurrences = sameCardRankCount.get(currentCard.getRank());
                sameCardRankCount.put(currentCard.getRank(), occurrences + 1);
            } else {
                sameCardRankCount.put(currentCard.getRank(), 1);
            }

        }
        return sameCardRankCount;
    }

    public boolean isFourOfAKind() {
        HashMap<Integer, Integer> sameCardRankCount = countSameCardRank();
        for (Integer count : sameCardRankCount.values()) {
            if (count == 4) {
                return true;
            }
        }
        return false;
    }

    public boolean isThreeOfAKind() {
        HashMap<Integer, Integer> sameCardRankCount = countSameCardRank();
        for (Integer count : sameCardRankCount.values()) {
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean isPair() {
        HashMap<Integer, Integer> sameCardRankCount = countSameCardRank();
        for (Integer count : sameCardRankCount.values()) {
            if (count == 2) {
                return true;
            }
        }
        return false;
    }
    public boolean isTwoPairs() {
        HashMap<Integer, Integer> sameCardRankCount = countSameCardRank();
        int occurrences = 0;
        for (Integer count : sameCardRankCount.values()) {
            occurrences = occurrences + 1;
            if (count == 2 && occurrences == 2) {
                return true;
            }
        }
        return false;
    }
    public boolean isFullHouse() {
        HashMap<Integer, Integer> sameCardRankCount = countSameCardRank();
        int occurrences = 0;
        for (Integer count : sameCardRankCount.values()) {
            occurrences = occurrences + 1;
            if (count == 3 && occurrences == 1) {
                    return true;
            }
        }
        return false;
    }
}
