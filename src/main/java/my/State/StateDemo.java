package State;

public class StateDemo {
    public static void main(String[] args) {
        MaterialObject materialObject = new MaterialObject(new Solid());
        System.out.println(materialObject.getState());
        System.out.println("--------------------");
        materialObject.pourItOut();

        System.out.println("--------------------");
        materialObject.setState(new Gaseous());
        materialObject.smellIt();
    }
}
