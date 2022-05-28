package my.singleton;

public class Singleton {
    private static Singleton event;
    private final String currentPresidentOfUkraine;

    public String getCurrentPresidentOfUkraine() {
        return currentPresidentOfUkraine;
    }

    private Singleton() {
        currentPresidentOfUkraine = "Зеленський Володимир Олександрович";
    }

    public static Singleton getSingleton(){
        if(event == null){
            event = new Singleton();
        }
        return event;
    }
}
