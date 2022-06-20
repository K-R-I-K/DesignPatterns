package State;

public class Gaseous extends State {

    Gaseous() {
        super();
        stateName = "Gaseous";
    }

    @Override
    public boolean smell() {
        System.out.println(stateName + " : you can smell it");
        return true;
    }
}
