package poker;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private final List<Card> deck = new ArrayList<>();

    public void reshuffle() {
        deck.clear();
        deck.add(new Card('2', 'H'));
        deck.add(new Card('2', 'D'));
        deck.add(new Card('2', 'S'));
        deck.add(new Card('2', 'C'));
        deck.add(new Card('3', 'H'));
        deck.add(new Card('3', 'D'));
        deck.add(new Card('3', 'S'));
        deck.add(new Card('3', 'C'));
        deck.add(new Card('4', 'H'));
        deck.add(new Card('4', 'D'));
        deck.add(new Card('4', 'S'));
        deck.add(new Card('4', 'C'));
        deck.add(new Card('5', 'H'));
        deck.add(new Card('5', 'D'));
        deck.add(new Card('5', 'S'));
        deck.add(new Card('5', 'C'));
        deck.add(new Card('6', 'H'));
        deck.add(new Card('6', 'D'));
        deck.add(new Card('6', 'S'));
        deck.add(new Card('6', 'C'));
        deck.add(new Card('7', 'H'));
        deck.add(new Card('7', 'D'));
        deck.add(new Card('7', 'S'));
        deck.add(new Card('7', 'C'));
        deck.add(new Card('8', 'H'));
        deck.add(new Card('8', 'D'));
        deck.add(new Card('8', 'S'));
        deck.add(new Card('8', 'C'));
        deck.add(new Card('9', 'H'));
        deck.add(new Card('9', 'D'));
        deck.add(new Card('9', 'S'));
        deck.add(new Card('9', 'C'));
        deck.add(new Card('T', 'H'));
        deck.add(new Card('T', 'D'));
        deck.add(new Card('T', 'S'));
        deck.add(new Card('T', 'C'));
        deck.add(new Card('J', 'H'));
        deck.add(new Card('J', 'D'));
        deck.add(new Card('J', 'S'));
        deck.add(new Card('J', 'C'));
        deck.add(new Card('Q', 'H'));
        deck.add(new Card('Q', 'D'));
        deck.add(new Card('Q', 'S'));
        deck.add(new Card('Q', 'C'));
        deck.add(new Card('K', 'H'));
        deck.add(new Card('K', 'D'));
        deck.add(new Card('K', 'S'));
        deck.add(new Card('K', 'C'));
        deck.add(new Card('A', 'H'));
        deck.add(new Card('A', 'D'));
        deck.add(new Card('A', 'S'));
        deck.add(new Card('A', 'C'));
    }

    public List<Card> getDeck() {
        return deck;
    }
}
