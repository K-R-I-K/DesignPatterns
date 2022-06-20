package Composite;

class SimpleObject implements Component {

    private ComputerComponents components;

    SimpleObject(ComputerComponents components){
        this.components = components;
    }

    public ComputerComponents getComponents() {
        return components;
    }

    @Override
    public int execute() {
        return components.getPrice();
    }
}
