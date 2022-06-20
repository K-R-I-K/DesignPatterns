package Flyweight;

import java.util.ArrayList;

public class Forest {
    private ArrayList<FlyweightTree> trees = new ArrayList<>();

    public FlyweightTree plantTree(Height height, TreeType treeType){
        TreeType type = TreeFactory.getTreeType(treeType.getColor(),treeType.getTypes());
        FlyweightTree tree = new FlyweightTree(height,type);
        trees.add(tree);
        return tree;
    }

    public void treesInForest(){
        for(FlyweightTree tree : trees){
            System.out.println(tree);
        }
    }
}
