package Mediator;

public class MediatorDemo {
    public static void main(String[] args) {

        Mediator mediator = new Dispatcher();
        Aircraft aircraft = new Helicopter(mediator);
        aircraft.getMediator().dispatch(aircraft);
        if(mediator instanceof Dispatcher dispatcher){
            System.out.println(dispatcher.getName());
            System.out.println(dispatcher.getDetailedInfo());
        }
    }
}
