package Decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        String message = "really small message";
        ConcreteComponent component = new ConcreteComponent();

        Decorator decorator = new EmailDecorator(new DecoratorSMS(component));
        decorator.sendMessage(message);

        System.out.println("--------------------");
        decorator = new DecoratorSMS(component);
        decorator.sendMessage(message);

        System.out.println("--------------------");
        if(decorator.goToTheNextStep(true)){
            decorator = new EmailDecorator(component);
        } else {
            decorator = new DecoratorSMS(component);
        }
        decorator.sendMessage(message);
    }
}
