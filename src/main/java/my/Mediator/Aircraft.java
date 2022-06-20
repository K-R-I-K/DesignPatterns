package Mediator;

public abstract class Aircraft {
    protected Mediator mediator;
    public abstract String fly();

    public Aircraft(Mediator mediator){
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
