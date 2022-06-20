package Mediator;

public class Helicopter extends Aircraft {
    public Helicopter(Mediator mediator) {
        super(mediator);
    }

    @Override
    public String fly() {
        return "I'm a helicopter";
    }

    public String fire(){
        return "Helicopter has 2 weapons";
    }
}
