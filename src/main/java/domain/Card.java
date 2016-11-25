package domain;

/**
 * Created by minseokism on 2016-11-25.
 */
public class Card {
    private String suit;
    private String denomination;
    private int number;

    public Card(String suit, String denomination) {
        this.suit = suit;
        this.denomination = denomination;
        this.number = denominationToNumber(denomination);
    }

    public int denominationToNumber(String denomination) {
        if (denomination.equals("A")) {
            return 1;
        } else if (denomination.equals("J")) {
            return 10;
        } else if (denomination.equals("Q")) {
            return 10;
        } else if (denomination.equals("K")) {
            return 10;
        }
        return Integer.parseInt(denomination);
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    @Override
    public String toString() {
        return "suit = "+suit+", denomination = "+denomination ;
    }
}
