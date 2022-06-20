package State;

// It is a behavioral design pattern that allows objects to
// change their behavior depending on their condition.
// From the outside, it looks like the class of the object has changed.
//
// It is an abstract machine that can be in exactly one
// of a finite number of states at any given time.
//
// A very important advantage that differs this pattern from the
// Strategy, is that both the context and the specific states can be known
// about each other and initiate transitions from one state to
// another.
//
// Advantages :
//      + Gets rid of many large conditional machine operators
//          states.
//      + Concentrates in one place the code associated with a
//          particular state.
//
// Disadvantages :
//      - It can unnecessarily complicate the code if there are
//          few states, and they rarely change.

public abstract class State {
    protected String stateName;

    State(){}

    public boolean takeInHand() {
        System.out.println(stateName + " : you can't take it");
        return false;
    }
    public boolean drink() {
        System.out.println(stateName + " : you can't drink it");
        return false;
    }
    public boolean smell() {
        System.out.println(stateName + " : you can't smell it");
        return false;
    }
    public String getStateName() {
        return stateName;
    }

    @Override
    public String toString() {
        return "State{" +
                "stateName='" + stateName + '\'' +
                '}';
    }
}