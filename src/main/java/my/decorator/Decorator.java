package Decorator;

// It is a structural design pattern that gives
// the ability to dynamically add new functionality to objects,
// wrapping them in useful "wrappers".
//
// Advantages :
//      + Allows you to add responsibilities dynamically.
//      + You can add several new responsibilities at once.
//      + Allows you to have multiple small objects instead of one
//          "For all occasions."
//
// Disadvantages :
//      - It is difficult to configure objects that are wrapped in
//          multiple groups at the same time.
//      - A large number of tiny classes.

public class Decorator implements Component {

    private Component component;

    Decorator(Component component){
        this.component = component;
    }

    public boolean goToTheNextStep(boolean a){
        return a;
    }

    @Override
    public void sendMessage(String message) {
        component.sendMessage(message);
    }
}
