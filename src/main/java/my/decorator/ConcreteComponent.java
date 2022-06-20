package Decorator;

// The specific component defines the class of objects to be wrapped.
// It contains some basic behavior that is then changed in decorators.

public class ConcreteComponent implements Component {
    @Override
    public void sendMessage(String message) {
        System.out.println("Redirecting to other decorators");
    }
}
