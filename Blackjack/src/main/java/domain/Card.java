package domain;

/**
 * Created by minseokism on 2016-11-25.
 */
public class Card {
    private String suit;
    private String denomination;
    private int point;

    public Card(String suit, int number) {
        this.suit = suit;
        this.denomination = numberToDenomination(number);
        this.point = numberToPoint(number);
    }

    public String numberToDenomination(int number) {
        String denomination;

        if( number == 1) denomination = "A";
        else if ( number == 11 ) denomination = "J";
        else if ( number == 12 ) denomination = "Q";
        else if ( number == 13 ) denomination = "K";
        else denomination = number+"";

        return denomination;
    }

    public int numberToPoint(int number) {
        if (number > 10) number = 10;
        return number;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
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
