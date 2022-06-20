package State;

public class Liquid extends State {

    Liquid() {
        super();
        stateName = "Liquid";
    }

    @Override
    public boolean drink() {
        System.out.println(stateName + " : you can drink it");
        return true;
    }
}
