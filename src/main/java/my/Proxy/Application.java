package Proxy;

public class Application {
    private static DataBaseProxy dataBaseProxy;
    private Application(){}
    public static void init(){
        DataBase dataBase = new DataBase();
        dataBaseProxy = new DataBaseProxy(dataBase);
    }

    public static DataBaseProxy getDataBaseProxy() {
        return dataBaseProxy;
    }
}
