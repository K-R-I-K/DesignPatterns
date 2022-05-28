package my.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that implement Decorator pattern to List of String object.
 * The output object must have some "read" methods.
 * That lets attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.
 */
public class Decorators {
    /**
     * It's method which implement all functional of decorator.
     * @param sourceList This is source list of strings.
     * @return This is decorated list. It`s support "read" methods: get(), size(), iterator().
     */
    public static List<String> evenIndexElementsSubList(List<String> sourceList) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < sourceList.size(); i+=2) {
            res.add(sourceList.get(i));
        }
        return res;
    }
}
