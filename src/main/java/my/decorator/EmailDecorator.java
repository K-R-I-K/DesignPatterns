package Decorator;

public class EmailDecorator extends Decorator{

    EmailDecorator(Component component) {
        super(component);
    }

    @Override
    public void sendMessage(String message) {
        super.sendMessage(message);
        System.out.println("This message : '" + message + "' was delivered by email");
    }
}
