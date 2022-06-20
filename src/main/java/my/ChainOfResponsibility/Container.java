package ChainOfResponsibility;

import java.util.ArrayList;

public class Container extends ChainOfResponsibility {
    ArrayList<ChainOfResponsibility> chainOfResponsibility = new ArrayList<>();

    public void add(ChainOfResponsibility chain){
        chainOfResponsibility.add(chain);
    }

    public boolean start(String line){
        for (ChainOfResponsibility chainOfResponsibility : chainOfResponsibility){
            if (!chainOfResponsibility.checkWordsCount(line)){
                return false;
            }
        }
        return true;
    }

    public ArrayList<ChainOfResponsibility> getChainOfResponsibility(){
        return chainOfResponsibility;
    }
}