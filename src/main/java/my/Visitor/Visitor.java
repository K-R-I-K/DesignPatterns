package Visitor;

// The visitor is a behavioral pattern of design that gives
// be able to add new operations to the program without changing it
// classes of objects on which these operations can be performed.
//
// Advantages :
//      + Simplifies the addition of complex operations
//          object structures.
//      + Combines related operations in one class.
//
// Disadvantages :
//      - The pattern is unjustified if the hierarchy of elements is frequent
//          is changing.

public interface Visitor {
    public String visitMuseum(Museum museum);
    public String visitHouse(House house);
}
