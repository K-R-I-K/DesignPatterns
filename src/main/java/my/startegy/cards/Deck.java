package my.startegy.cards;

import java.util.List;

/**
 * Interface that represent our deck.
 */
public interface Deck{
    /**
     * Method which represent giving card.
     * @return Card in depends on strategy.
     */
    Card dealCard();

    /**
     * Method which represent rest of cards.
     * @return Rest of cards like list of Card.
     */
    List<Card> restCards();

    /**
     * Getter of size of deck.
     * @return size of deck.
     */
    int size();
}
