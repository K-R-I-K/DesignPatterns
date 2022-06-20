package Composite;

public class CompositeDemo {
    public static void main(String[] args) {

        Composite composite = new Composite();
        composite.add(new SimpleObject(ComputerComponents.CPU));
        composite.add(new SimpleObject(ComputerComponents.VideoCard));
        composite.add(new ComplexObject(new ComplexObject(new SimpleObject(ComputerComponents.CPU))));
        composite.add(new ComplexObject(new SimpleObject(ComputerComponents.RAM)));
        composite.execute();
    }
}
