package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minseokism on 2016-11-25.
 */
public class Game {

    public void play() {
        System.out.println("Hello Blackjack Game");

        CardDeck cardDeck = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        Rule rule = new Rule();
    }

}
