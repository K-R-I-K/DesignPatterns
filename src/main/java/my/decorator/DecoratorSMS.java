package Decorator;

public class DecoratorSMS extends Decorator {

    DecoratorSMS(Component component) {
        super(component);
    }

    @Override
    public void sendMessage(String message) {
        super.sendMessage(message);
        System.out.println("This message : '" + message + "' was delivered by sms");
    }

}
