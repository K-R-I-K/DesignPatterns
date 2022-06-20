package Flyweight;

import java.util.ArrayList;

// This factory saves in array new types of trees.
// In the other way it returns object link.

public class TreeFactory {
    private static ArrayList<TreeType> treeTypes = new ArrayList<>();
    public static TreeType getTreeType(String color, Types types){
        for (TreeType treeType : treeTypes){
            if(treeType.getColor().equals(color) && treeType.getTypes().equals(types)){
                return treeType;
            }
        }
        TreeType treeType = new TreeType(color,types);
        treeTypes.add(treeType);
        return treeType;
    }
}
