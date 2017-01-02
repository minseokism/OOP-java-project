package domain;

import java.util.*;

/**
 * Created by minseokism on 2016-11-25.
 */
public class CardDeck {
    private static final String[] SUITS = {"spade", "diamond", "club", "heart"};
    private static final int CARD_COUNT = 13;
    private Stack<Card> cards;

    public CardDeck() {
        cards = createCard();
        Collections.shuffle(cards);
    }

    public Stack<Card> createCard() {
        Stack<Card> cards = new Stack<Card>();

        for(String suit : SUITS) {
            for(int i = 1 ; i <= CARD_COUNT ; i++) {
                cards.add(new Card(suit, i));
            }
        }

        return cards;
    }

    public Card draw() {
        return cards.pop();
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
