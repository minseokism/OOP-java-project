package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minseokism on 2016-11-25.
 */
public class Dealer implements Player{
    private List<Card> cards;

    public Dealer() {
        this.cards = new ArrayList();
    }

    public void recieveCard(Card card) {
        cards.add(card);
        showCards();
    }

    public void showCards() {
        StringBuilder sb = new StringBuilder();
        System.out.println("현재 카드 목록");
        for(Card card : cards) {
            sb.append(card.toString());
            sb.append("\n");
        }

        System.out.println(sb);
    }

    public List<Card> openCards() {
        return this.cards;
    }

    public void turnOff() {}
}
