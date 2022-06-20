package Mediator;

// The Mediator pattern forces objects to communicate
// through a single reseller who knows who to forward a
// request to. Due to this component systems will depend
// only on the intermediary and not on dozens of other components.
//
// Advantages :
//      + When it is difficult to change some classes because of
//          what they have a huge number of chaotic connections with others
//          classes.
//      + Centralizes management in one place.
//      + Simplifies the interaction between components.
//
// Disadvantages :
//      - The mediator can be very "inflated".

public interface Mediator {
    public void dispatch(Aircraft aircraft);
}
