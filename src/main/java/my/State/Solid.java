package State;

public class Solid extends State {

    Solid() {
        super();
        stateName = "Solid";
    }

    @Override
    public boolean takeInHand() {
        System.out.println(stateName + " : you can take it");
        return true;
    }
}
