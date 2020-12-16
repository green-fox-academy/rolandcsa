package poker;

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
        int rankSum = 0;
        for (Card card : hand.getHand()) {
            rankSum += card.getRank();
        }
        int highestRank = 0;
        for (int i = 0; i < hand.getHand().size(); i++) {
            if (hand.getHand().get(i).getRank() > highestRank) {
                highestRank = hand.getHand().get(i).getRank();
            }
        }
        if (rankSum == 15 && highestRank == 5) {
            return true;
        } else if (rankSum == 20 && highestRank == 6) {
            return true;
        } else if (rankSum == 25 && highestRank == 7) {
            return true;
        } else if (rankSum == 30 && highestRank == 8) {
            return true;
        } else if (rankSum == 35 && highestRank == 9) {
            return true;
        } else if (rankSum == 40 && highestRank == 10) {
            return true;
        } else if (rankSum == 45 && highestRank == 11) {
            return true;
        } else if (rankSum == 50 && highestRank == 12) {
            return true;
        } else if (rankSum == 55 && highestRank == 13) {
            return true;
        } else return rankSum == 23 && highestRank == 13;
    }

    public static boolean isStraightFlush(Hand hand) {
        return isFlush(hand) && isStraight(hand);
    }

    public static boolean isFourOfAKind(Hand hand) {
        int counter = 0;
        for (int i = 0; i < hand.getHand().size(); i++) {
            for (int j = 0; j < i - j ; j++) {
                if (hand.getHand().get(i).getName() == hand.getHand().get(j).getName()) {
                    counter++;
                }
            }
        }
        return counter == 4;
    }
    public static boolean isThreeOfAKind(Hand hand) {
        int counter = 0;
        for (int i = 0; i < hand.getHand().size(); i++) {
            for (int j = 0; j < i - j ; j++) {
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
            for (int j = 0; j < i - j ; j++) {
                if (hand.getHand().get(i).getName() == hand.getHand().get(j).getName()) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
        return counter == 2;
    }
}
