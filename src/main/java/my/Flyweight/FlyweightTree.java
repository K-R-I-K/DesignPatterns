package Flyweight;

// A lightweight is a structural design pattern that
// allows you to fit more objects in the allotted
// RAM. The lightweight saves memory,
// sharing the common state of objects among themselves, instead
// storing the same data in each object.
//
// Advantages :
//      + Saves RAM
//
// Disadvantages :
//      - Complicates the program code due to the introduction
//          of many additional classes.

public class FlyweightTree {
    private Height height;
    private TreeType treeType;

    public FlyweightTree(Height height, TreeType type) {
        this.height = height;
        this.treeType = type;
    }

    public Height getHeight() {
        return height;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    public void grow(){
        System.out.println("The tree " + this + " is growing");
    }

    @Override
    public String toString() {
        return "FlyweightTree{" +
                "height=" + height +
                ", treeType=" + treeType +
                '}';
    }
}
