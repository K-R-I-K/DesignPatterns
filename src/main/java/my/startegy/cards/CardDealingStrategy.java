package my.startegy.cards;

import java.util.List;
import java.util.Map;

/**
 * It is a strategy of dealing cards for a card game.
 * Each game defines how many cards should be dealt to a player and what additional card stacks should be dealt as well.
 */
public interface CardDealingStrategy {
    /**
     * It's result of it is a Map containing named card stacks (as Lists).
     * Each player's stack has a name on its number: "Player 1", "Player 2", and so on.
     * Additional stacks varies from game to game.
     * The rest of the card deck becomes a "Remaining" stack.
     * @param deck Our deck.
     * @param players Players which play.
     * @return It's result of it is a Map containing named card stacks.
     */
    Map<String, List<Card>> dealStacks(Deck deck, int players);
}
