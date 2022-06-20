package Factory;

// It is a generative pattern design, which
// defines a common interface for creating objects
// in a superclass, allowing subclasses
// change the type of objects being created.
//
// Advantages :
//      - Relieves the class from being tied to specific classes
//          products.
//      - Allocates the code of production of products in one place, simplifies
//          code support.
//      - Simplifies adding new products to the program.
//
// Disadvantages :
//      - Can lead to the creation of large parallel hierarchies
//          classes for each product class requires the creation of
//          dig your own subclass of the creator.

public abstract class Factory
{
    public void transportWay(Transport transport){
        transport.deliveringWay();
    }

    public void deliveringWay(Transport transport){
        transport.deliver();
    }

    public abstract Transport crateTransportWay();
}