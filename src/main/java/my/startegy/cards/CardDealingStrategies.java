package my.startegy.cards;

import java.util.*;

/**
 * It lets define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.
 */
public class CardDealingStrategies {
    /**
     * Method that returns a CardDealingStrategy for Texas Hold'em Poker.
     * 2 cards per player, 5 cards in additional "Community" stack.
     * @return Specific strategy.
     */
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

    /**
     * Method that returns a CardDealingStrategy for Classic Poker.
     * 5 cards per player, no additional stacks.
     * @return Specific strategy.
     */
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

    /**
     * Method that returns a CardDealingStrategy for Bridge.
     * 13 cards per player, no additional stacks.
     * @return Specific strategy.
     */
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

    /**
     * Method that  returns a CardDealingStrategy for Fool.
     * 6 cards per player, 1 card in additional "Trump card" stack.
     * @return Specific strategy.
     */
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