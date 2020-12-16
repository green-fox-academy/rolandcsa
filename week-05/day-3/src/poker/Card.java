package poker;

public class Card {
    private final Character name;
    private final Character suit;
    private Integer rank;

    public Card(char name, char color) {
        this.name = name;
        this.suit = color;
        if (name == '2') {
            rank = 1;
        } else if (name == '3') {
            rank = 2;
        } else if (name == '4') {
            rank = 3;
        } else if (name == '5') {
            rank = 4;
        } else if (name == '6') {
            rank = 5;
        } else if (name == '7') {
            rank = 6;
        } else if (name == '8') {
            rank = 7;
        } else if (name == '9') {
            rank = 8;
        } else if (name == 'T') {
            rank = 9;
        } else if (name == 'J') {
            rank = 10;
        } else if (name == 'Q') {
            rank = 11;
        } else if (name == 'K') {
            rank = 12;
        } else if (name == 'A') {
            rank = 13;
        }
    }

    public Character getName() {
        return name;
    }

    public Character getSuit() {
        return suit;
    }

    public Integer getRank() {
        return rank;
    }
}
