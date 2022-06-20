package Mediator;

public class Plane extends Aircraft {
    public Plane(Mediator mediator) {
        super(mediator);
    }

    @Override
    public String fly() {
        return "I'm a plane";
    }

    public String flyHigh(){
        return "Plane can fly on 10km height";
    }
}
