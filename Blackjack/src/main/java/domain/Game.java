package domain;

import java.util.Scanner;

/**
 * Created by minseokism on 2016-11-25.
 */
public class Game {
    private static final int INIT_RECEIVE_CARD_COUNT = 2;

    public void play() {
        System.out.println("Hello Blackjack Game");
        Scanner sc = new Scanner(System.in);
        CardDeck cardDeck = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        Rule rule = new Rule();

        initPhase(cardDeck, gamer, dealer);
        playingPhase(sc, cardDeck, gamer);
    }

    public void playingPhase(Scanner sc, CardDeck cardDeck, Gamer gamer) {
        String gamerInput;
        while(true) {
            System.out.println("카드를 뽑아주세요. (0 입력시 종료됩니다.)");
            gamerInput = sc.nextLine();
            if("0".equals(gamerInput)){
                break;
            }
            gamer.recieveCard(cardDeck.draw());
        }

    }

    public void initPhase(CardDeck cardDeck, Gamer gamer, Dealer dealer) {
        System.out.println("처음 2장을 뽑겠습니다.");
        for (int i = 0 ; i < INIT_RECEIVE_CARD_COUNT ; i++) {
            gamer.recieveCard(cardDeck.draw());
            dealer.recieveCard(cardDeck.draw());
        }

    }
}
