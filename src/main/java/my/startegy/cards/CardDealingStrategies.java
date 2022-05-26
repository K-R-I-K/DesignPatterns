package my.startegy.cards;

import java.util.*;

public class CardDealingStrategies {
    public static CardDealingStrategy texasHoldemCardDealingStrategy() {
        return (deck, players) -> {
            Map<String, List<Card>> cards = new HashMap<>();
            for(int j = 0; j < 2; ++j) {
                for (int i = 0; i < players; ++i) {
                    cards.computeIfAbsent("Player " + (i + 1), k1 -> new ArrayList<>());
                    cards.get("Player " + (i + 1)).add(deck.dealCard());
                }
            }
            cards.put("Community", new ArrayList<>());
            for(int i = 0; i < 5; ++i){
                cards.get("Community").add(deck.dealCard());
            }
            cards.put("Remaining", deck.restCards());
            return cards;
        };
    }

    public static CardDealingStrategy classicPokerCardDealingStrategy() {
        return (deck, players) -> {
            Map<String, List<Card>> cards = new HashMap<>();
            for(int j = 0; j < 5; ++j) {
                for (int i = 0; i < players; ++i) {
                    cards.computeIfAbsent("Player " + (i + 1), k1 -> new ArrayList<>());
                    cards.get("Player " + (i + 1)).add(deck.dealCard());
                }
            }
            cards.put("Remaining", deck.restCards());
            return cards;
        };
    }

    public static CardDealingStrategy bridgeCardDealingStrategy(){
        return (deck, players) -> {
            Map<String, List<Card>> cards = new HashMap<>();
            for(int j = 0; j < 13; ++j) {
                for (int i = 0; i < players; ++i) {
                    cards.computeIfAbsent("Player " + (i + 1), k1 -> new ArrayList<>());
                    cards.get("Player " + (i + 1)).add(deck.dealCard());
                }
            }
            return cards;
        };
    }

    public static CardDealingStrategy foolCardDealingStrategy(){
        return (deck, players) -> {
            Map<String, List<Card>> cards = new HashMap<>();
            for(int j = 0; j < 6; ++j) {
                for (int i = 0; i < players; ++i) {
                    cards.computeIfAbsent("Player " + (i + 1), k1 -> new ArrayList<>());
                    cards.get("Player " + (i + 1)).add(deck.dealCard());
                }
            }
            cards.put("Trump card", new ArrayList<>());
            cards.get("Trump card").add(deck.dealCard());
            cards.put("Remaining", deck.restCards());
            return cards;
        };
    }

}