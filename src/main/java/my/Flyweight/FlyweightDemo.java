package Flyweight;

public class FlyweightDemo {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(Height.HIGH,new TreeType("red",Types.BIRCH));
        forest.plantTree(Height.MIDDLE,new TreeType("red",Types.BIRCH));
        forest.plantTree(Height.MIDDLE,new TreeType("yellow",Types.MAPLE));
        forest.treesInForest();
    }
}
