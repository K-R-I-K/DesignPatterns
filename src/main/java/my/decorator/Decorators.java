package my.decorator;

import java.util.ArrayList;
import java.util.List;

public class Decorators {
    public static List<String> evenIndexElementsSubList(List<String> sourceList) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < sourceList.size(); i+=2) {
            res.add(sourceList.get(i));
        }
        return res;
    }
}
