package Builder;

// It is a generative pattern of design,
// which allows you to create complex objects, step by step.
// The builder makes it possible to use both
// the very construction code to get different
// display objects.
//
// Advantages :
//      + Allows you to create products step by step
//      + Allows you to use the same code to create different products.
//
// Disadvantages :
//      - Complicates the program code due to additional classes
//      - The client will be tied to specific classes of construction
//          because there is no method in the builder interface
//          getting the result.

public interface Builder
{
    public Material getMainMaterial();
    public double buildFloor(int count);
    public double buildCeiling();
    public double buildWindow(int count);
    public double buildDoor(int count);
    public double buildWall(int count);
    default public double buildPool(){
        return 150;
    }
    default public double buildGarage(){
        return 200;
    }
}