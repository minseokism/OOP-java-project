package domain;

import java.util.List;

/**
 * Created by minseokism on 2016-12-31.
 */
public interface Player {
    void recieveCard(Card card) ;

    void showCards();

    List<Card> openCards();

    void turnOff();
}

