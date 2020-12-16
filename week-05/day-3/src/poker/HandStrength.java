package poker;

import java.util.Collections;
import java.util.HashMap;

public class HandStrength {
    public static boolean isFlush(Hand hand) {
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

    public static boolean isStraight(Hand hand) {
        Collections.sort(hand.getHand());
        for (int i = 0; i < 4; i++) {
            if (hand.getHand().get(i).getRank() + 1 != hand.getHand().get(i + 1).getRank()) {
                return false;
            }
        }
        return true;
    }

    public static boolean isStraightFlush(Hand hand) {
        return isFlush(hand) && isStraight(hand);
    }

    private static HashMap<Integer, Integer> countCard(Hand hand) {
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

    public static boolean isFourOfAKind(Hand hand) {
        HashMap<Integer, Integer> cardCount = countCard(hand);
        for (Integer entry : cardCount.values()) {
            if (entry == 4) {
                return true;
            }
        }
        return false;
    }


//
//
//                int counter=0;
//                for(int i=0;i<hand.getHand().size();i++){
//        for(int j=0;j<i -j;j++){
//        if(hand.getHand().get(i).getName()==hand.getHand().get(j).getName()){
//        counter++;
//        }
//        }
//        }
//        return counter==4;
//        }

    public static boolean isThreeOfAKind(Hand hand) {
        int counter = 0;
        for (int i = 0; i < hand.getHand().size(); i++) {
            for (int j = 0; j < i - j; j++) {
                if (hand.getHand().get(i).getName() == hand.getHand().get(j).getName()) {
                    counter++;
                }
            }
        }
        return counter == 3;
    }

    public static boolean isPair(Hand hand) {
        int counter = 0;
        for (int i = 0; i < hand.getHand().size(); i++) {
            for (int j = 0; j < i - j; j++) {
                if (hand.getHand().get(i).getName() == hand.getHand().get(j).getName()) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
        return counter == 2;
    }
}
