package my.observer.git;

import java.util.List;

/**
 * Class that represent our observers that observe commit or merge events.
 */
public interface WebHook {
    /**
     * Getter to name of branch.
     * @return name of branch.
     */
    String branch();

    /**
     * Getter to last event type.
     * @return Type of last event.
     */
    Event.Type type();

    /**
     * Getter of events in this branch.
     * @return list of events.
     */
    List<Event> caughtEvents();

    /**
     * Method to add event to branch.
     * @param event it's event which we add to branch.
     */
    void onEvent(Event event);
}
