package Composite;

import java.util.ArrayList;

// It is a structural design plan that allows you to
// group several objects in a tree structure and then
// work with it as if it were a single object.
//
// Advantages :
//      + Simplifies the client architecture when working
//          with a complex component tree.
//      + Facilitates the addition of new types of components.
//
// Disadvantages :
///     - Creates too general classroom design.

public class Composite implements Component {

    private ArrayList<Component> component = new ArrayList<>();

    public boolean add(Component component){
        return this.component.add(component);
    }

    public boolean remove(int index){
        try {
            this.component.remove(index);
        } catch (IndexOutOfBoundsException e){
            return false;
        }
        return true;
    }

    public ArrayList<Component> getComponent() {
        return component;
    }

    @Override
    public int execute() {
        int result = 0;
        System.out.println("Item list :");
        for (Component component1 : component){
            if(component1 instanceof ComplexObject complexObject){
                result += complexObject.execute();
            } else if(component1 instanceof SimpleObject simpleObject) {
                System.out.println("   - " + simpleObject.getComponents() +
                        " = " + simpleObject.execute());
                result += simpleObject.execute();
            }
        }
        System.out.println(" Total price = " + result + "$");
        return result;
    }
}
