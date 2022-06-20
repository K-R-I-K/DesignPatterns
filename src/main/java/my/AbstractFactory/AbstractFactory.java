package AbstractFactory;

// It is the generating pattern of design that allows you
// to create families of related objects without
// being tied to specific classes of created objects.
//
// Advantages :
//      - Frees client code from binding to specific product classes.
//      - Allocates product production code in one place, simplifying code support.
//      - Simplifies adding new products to the program.
//
// Disadvantages :
//      - Complicates the program code due to the introduction of
//          a large number of additional classes.

public interface AbstractFactory
{
    public abstract VideoCard createVideoCard();
    public abstract CPU createCPU();
    public abstract RAM createRAM();
}