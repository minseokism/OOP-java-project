package domain;

import java.util.List;

/**
 * Created by minseokism on 2016-11-25.
 */
public class Gamer {
    private List<Card> cards;

    public void recieveCard(Card card) {
        cards.add(card);
    }

    public List<Card> openCards() {
        return null;
    }
}
