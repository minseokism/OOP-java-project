package domain;

import java.util.*;

/**
 * Created by minseokism on 2016-11-25.
 */
public class CardDeck {
    private static final String[] SUITS = {"spade", "diamond", "club", "heart"};
    private static final int CARD_COUNT = 13;
    private List<Card> cards;

    public CardDeck() {
        cards = createCard();
        Collections.shuffle(cards);
    }

    public List<Card> createCard() {
        List<Card> cards = new LinkedList<Card>();
        String denomination;

        for(String suit : SUITS) {
            for(int i = 1 ; i <= CARD_COUNT ; i++) {
                if( i == 1) denomination = "A";
                else if ( i == 11 ) denomination = "J";
                else if ( i == 12 ) denomination = "Q";
                else if ( i == 13 ) denomination = "K";
                else denomination = i+"";

                cards.add(new Card(suit, denomination));
            }
        }

        return cards;
    }

    public Card draw() {
        Card card = cards.get(0);
        cards.remove(0);
        return card;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Card card : cards) {
            sb.append(card.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
