package my.singleton;

/**
 * Class that implement Singleton pattern.
 * Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.
 */
public class Singleton {
    private static Singleton event;
    private final String currentPresidentOfUkraine;

    /**
     * It`s getter for private class variable
     * @return name of the current president of Ukraine
     */
    public String getCurrentPresidentOfUkraine() {
        return currentPresidentOfUkraine;
    }

    /**
     * It`s private constructor, that assign private class variable (name of the current president of Ukraine)
     */
    private Singleton() {
        currentPresidentOfUkraine = "Зеленський Володимир Олександрович";
    }

    /**
     * It`s getter for private class variable
     * @return class reference to itself
     */
    public static Singleton getSingleton(){
        if(event == null){
            event = new Singleton();
        }
        return event;
    }
}
